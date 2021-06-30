package com.xmlvhy.shop.dao;

import com.xmlvhy.shop.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Description:<描述>
 */
public interface OrderItemDao {

    int insertOrderItem(OrderItem orderItem);
    int insertOrderItemByOrderItems(@Param("orderItemList") List<OrderItem> orderItemList);
    List<OrderItem> selectOrderItemsByOrder(Integer orderId);

    List<OrderItem> selectOrderItemsByOrderIds();
}
