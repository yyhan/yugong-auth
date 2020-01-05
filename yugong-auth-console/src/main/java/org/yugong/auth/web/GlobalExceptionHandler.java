package org.yugong.auth.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yugong.auth.common.BaseException;
import org.yugong.auth.common.BaseResult;
import org.yugong.auth.common.Results;

/**
 * 全局异常处理
 *
 * @author 小天
 * @date 2019/12/14 16:56
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object exceptionHandler(Exception e) {
        if (e instanceof BaseException) {
            BaseException baseException = (BaseException) e;
            logger.error(MessageFormatter.arrayFormat("code={}, message={}", new Object[]{baseException.getCode(), baseException.getMessage()}).getMessage(), baseException);
            return BaseResult.build().error(baseException.getCode(), baseException.getMessage());
        }
        logger.error(MessageFormatter.arrayFormat("code={}, message={}", new Object[]{Results.EXCEPTION_CODE, e.getMessage()}).getMessage(), e);
        return BaseResult.build().error(Results.EXCEPTION_CODE, "系统错误");
    }
}
