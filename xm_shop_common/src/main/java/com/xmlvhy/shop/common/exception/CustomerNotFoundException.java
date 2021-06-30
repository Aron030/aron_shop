package com.xmlvhy.shop.common.exception;

/**
 * 用户不存在自定义异常
 */
public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException() {
    }

    public CustomerNotFoundException(String message) {
        super(message);
    }

    public CustomerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
