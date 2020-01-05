package org.yugong.auth.client;

import org.springframework.security.access.expression.SecurityExpressionOperations;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;
import org.springframework.security.web.util.matcher.IpAddressMatcher;
import org.yugong.auth.client.entity.YgAuthority;
import org.yugong.auth.client.entity.YgUser;

import javax.servlet.http.HttpServletRequest;

/**
 * spring security 表达式验证
 *
 * @author 小天
 * @date 2019/12/22 23:13
 * @see WebSecurityExpressionRoot
 */
public class YgSecurityExpressionRoot implements SecurityExpressionOperations {

    /**
     * Allows "permitAll" expression
     */
    public final boolean permitAll = true;

    /**
     * Allows "denyAll" expression
     */
    public final boolean denyAll = false;

    protected       YgAuthService      ygAuthService;
    protected final Authentication     authentication;
    protected final HttpServletRequest request;
    private         String             userAccount;
    private         YgUser             user;
    private         YgAuthority        ygAuthority;
    private         AuthorizationType  authorizationType;
    private         String             authorityCode;

    private AuthenticationTrustResolver trustResolver;

    public YgSecurityExpressionRoot(Authentication authentication, FilterInvocation fi, YgAuthService ygAuthService) {
        this.authentication = authentication;
        this.request = fi.getRequest();
        this.ygAuthService = ygAuthService;
        this.userAccount = this.request.getRemoteUser();
        Object principal = authentication.getPrincipal();
        if (principal != null) {
            if (principal instanceof YgUser) {
                this.user = (YgUser) principal;
            }
        }
        this.authorityCode = request.getRequestURI();
        this.ygAuthority = ygAuthService.getAuthorityByCode(this.authorityCode);
        if (this.ygAuthority != null) {
            this.authorizationType = AuthorizationType.parse(this.ygAuthority.getAuthorizationType());
        }
    }

    public void setTrustResolver(AuthenticationTrustResolver trustResolver) {
        this.trustResolver = trustResolver;
    }

    @Override
    public Authentication getAuthentication() {
        return authentication;
    }

    @Override
    public boolean hasAuthority(String authority) {
        if (!isAuthenticated()) {
            return false;
        }
        YgAuthority ygAuthority = ygAuthService.getAuthorityByCode(authority);
        if (ygAuthority == null) {
            return false;
        }
        return ygAuthService.existUserAuthority(user.getUserId(), ygAuthority.getAuthorityId());
    }

    @Override
    public boolean hasAnyAuthority(String... authorities) {
        return false;
    }

    @Override
    public boolean hasRole(String role) {
        return isAuthenticated() && ygAuthService.existUserRole(user.getUserId(), role);
    }

    @Override
    public boolean hasAnyRole(String... roles) {
        return false;
    }

    @Override
    public boolean permitAll() {
        return true;
    }

    @Override
    public boolean denyAll() {
        return false;
    }

    @Override
    public boolean isAnonymous() {
        return trustResolver.isAnonymous(authentication);
    }

    @Override
    public boolean isAuthenticated() {
        if (isAnonymous()) {
            return false;
        }
        if (this.authorizationType == null) {
            return true;
        }
        if (AuthorizationType.permit_all == this.authorizationType || AuthorizationType.authenticated == this.authorizationType) {
            return true;
        }
        if (AuthorizationType.group == this.authorizationType) {
            return ygAuthService.existGroupAuthority(user.getUserId(), this.ygAuthority.getAuthorityId());
        }
        if (AuthorizationType.role == this.authorizationType) {
            return ygAuthService.existRoleAuthority(user.getUserId(), this.ygAuthority.getAuthorityId());
        }
        if (AuthorizationType.user == this.authorizationType) {
            return ygAuthService.existUserAuthority(user.getUserId(), this.ygAuthority.getAuthorityId());
        }
        return ygAuthService.existUserAuthority(user.getUserId(), this.ygAuthority.getAuthorityId());
    }

    @Override
    public boolean isRememberMe() {
        return trustResolver.isRememberMe(authentication);
    }

    @Override
    public boolean isFullyAuthenticated() {
        return !trustResolver.isAnonymous(authentication)
                && !trustResolver.isRememberMe(authentication);
    }

    @Override
    public boolean hasPermission(Object target, Object permission) {
        return false;
    }

    @Override
    public boolean hasPermission(Object targetId, String targetType, Object permission) {
        return false;
    }

    /**
     * Takes a specific IP address or a range using the IP/Netmask (e.g. 192.168.1.0/24 or
     * 202.24.0.0/14).
     *
     * @param ipAddress the address or range of addresses from which the request must
     *                  come.
     * @return true if the IP address of the current request is in the required range.
     */
    public boolean hasIpAddress(String ipAddress) {
        return (new IpAddressMatcher(ipAddress).matches(request));
    }


}
