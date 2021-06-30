package com.xmlvhy.shop.common.exception;

/**
 * 客户登录自定义异常
 */
public class LoginErrorException extends RuntimeException {

    public LoginErrorException() {
        super();
    }

    public LoginErrorException(String message) {
        super(message);
    }

    public LoginErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
