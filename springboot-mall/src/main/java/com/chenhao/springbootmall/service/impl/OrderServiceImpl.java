package com.chenhao.springbootmall.service.impl;

import com.chenhao.springbootmall.dao.OrderDao;
import com.chenhao.springbootmall.dao.ProductDao;
import com.chenhao.springbootmall.dto.BuyItem;
import com.chenhao.springbootmall.dto.CreateOrderRequest;
import com.chenhao.springbootmall.model.OrderItem;
import com.chenhao.springbootmall.model.Product;
import com.chenhao.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        for(BuyItem buyItem: createOrderRequest.getBuyItems()){
            Product product = productDao.getProductById(buyItem.getProductId());

            //計算商品價錢
            int amount = buyItem.getQuantity() * product.getPrice();
            totalAmount = totalAmount + amount;

            OrderItem orderItem = new OrderItem();
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);

        }

        Integer orderId = orderDao.createOrder(userId,totalAmount);
        orderDao.createOrderItems(orderId ,orderItemList);
        return orderId;
    }
}
