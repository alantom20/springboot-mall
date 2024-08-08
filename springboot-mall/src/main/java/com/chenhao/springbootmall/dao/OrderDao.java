package com.chenhao.springbootmall.dao;

import com.chenhao.springbootmall.dto.CreateOrderRequest;
import com.chenhao.springbootmall.model.Order;
import com.chenhao.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    List<OrderItem> getOrderItemByOrderId(Integer orderId);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
