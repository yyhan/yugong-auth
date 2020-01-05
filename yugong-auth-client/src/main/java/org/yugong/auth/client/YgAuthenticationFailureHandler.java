package org.yugong.auth.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.ForwardAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证失败处理器
 *
 * @author 小天
 * @date 2019/12/20 1:03
 */
public class YgAuthenticationFailureHandler extends ForwardAuthenticationFailureHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * @param forwardUrl
     */
    public YgAuthenticationFailureHandler(String forwardUrl) {
        super(forwardUrl);
    }

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        logger.info("login failure");
        super.onAuthenticationFailure(request, response, exception);
    }
}
