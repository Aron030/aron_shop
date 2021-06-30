package com.xmlvhy.shop.service;

import com.xmlvhy.shop.pojo.OrderItem;

import java.util.List;

/**
 * Description: 订单明细业务接口
 */
public interface OrderItemService {
    Boolean saveOrderItem(OrderItem orderItem);

    List<OrderItem> findOrderItemsByOrderId(Integer id);
}
