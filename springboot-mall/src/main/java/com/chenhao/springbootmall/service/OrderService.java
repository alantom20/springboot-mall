package com.chenhao.springbootmall.service;

import com.chenhao.springbootmall.dto.CreateOrderRequest;
import com.chenhao.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId,CreateOrderRequest createOrderRequest);
}
