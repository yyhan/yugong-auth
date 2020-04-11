package org.yugong.auth.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.expression.SecurityExpressionOperations;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;

import javax.annotation.Resource;

/**
 * spring security 表达式处理器
 *
 * @author 小天
 * @date 2019/12/22 23:08
 */
public class YgSecurityExpressionHandler extends DefaultWebSecurityExpressionHandler {

    @Autowired
    private YgAuthContainer ygAuthContainer;

    @Resource
    private YgAuthService ygAuthService;

    private AuthenticationTrustResolver trustResolver = new AuthenticationTrustResolverImpl();

    @Override
    protected SecurityExpressionOperations createSecurityExpressionRoot(Authentication authentication, FilterInvocation fi) {
        YgSecurityExpressionRoot root = new YgSecurityExpressionRoot(ygAuthContainer, authentication, fi, ygAuthService);
        root.setTrustResolver(trustResolver);
        return root;
    }
}
