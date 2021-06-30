package com.xmlvhy.shop.common.exception;

/**
 * 商品类型存在异常
 */

public class ProductTypeExistException extends RuntimeException {
    public ProductTypeExistException() {
        super();
    }

    public ProductTypeExistException(String message) {
        super(message);
    }

    public ProductTypeExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
