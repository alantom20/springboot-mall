package com.chenhao.springbootmall.service;

import com.chenhao.springbootmall.dao.ProductDao;
import com.chenhao.springbootmall.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
