package com.chenhao.springbootmall.dao;

import com.chenhao.springbootmall.dto.CreateOrderRequest;
import com.chenhao.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId, Integer totalAmount);
    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
