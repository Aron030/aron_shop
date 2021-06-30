package com.xmlvhy.shop.common.exception;

/**
 * 手机号未注册自定义异常类
 */
public class PhoneNotRegistException extends RuntimeException {
    public PhoneNotRegistException() {
        super();
    }

    public PhoneNotRegistException(String message) {
        super(message);
    }

    public PhoneNotRegistException(String message, Throwable cause) {
        super(message, cause);
    }
}
