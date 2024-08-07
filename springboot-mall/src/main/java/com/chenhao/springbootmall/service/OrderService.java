package com.chenhao.springbootmall.service;

import com.chenhao.springbootmall.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId,CreateOrderRequest createOrderRequest);
}
