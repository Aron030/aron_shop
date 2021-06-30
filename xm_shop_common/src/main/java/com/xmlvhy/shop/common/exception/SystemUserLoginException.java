package com.xmlvhy.shop.common.exception;

/**
 * 自定义系统用户登录异常
 */
public class SystemUserLoginException extends RuntimeException {
    public SystemUserLoginException() {
        super();
    }

    public SystemUserLoginException(String message) {
        super(message);
    }

    public SystemUserLoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
