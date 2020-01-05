package org.yugong.auth.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.yugong.auth.client.entity.YgUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证成功处理器
 *
 * @author 小天
 * @date 2019/12/20 1:01
 */
public class YgAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private final String forwardUrl;
    private final String redirectUrl;

    public YgAuthenticationSuccessHandler(String forwardUrl, String redirectUrl) {
        this.forwardUrl = forwardUrl;
        this.redirectUrl = redirectUrl;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("login success");
        YgUser user = (YgUser) authentication.getPrincipal();
        user.clearSensitive();
        request.setAttribute(YgSecConstant.LOGIN_SUCCESS_REDIRECT_URL, redirectUrl);
        request.getRequestDispatcher(forwardUrl).forward(request, response);
    }
}
