package org.yugong.auth.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 注销成功处理器
 *
 * @author 小天
 * @date 2019/12/22 19:02
 */
public class YgLogoutSuccessHandler extends
        AbstractAuthenticationTargetUrlRequestHandler implements LogoutSuccessHandler{
    private Logger logger = LoggerFactory.getLogger(getClass());

    private String redirectUrl;

    public YgLogoutSuccessHandler(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        logger.info("logout success");
        response.sendRedirect(redirectUrl);
    }
}
