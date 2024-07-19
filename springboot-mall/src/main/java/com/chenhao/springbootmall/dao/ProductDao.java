package com.chenhao.springbootmall.dao;

import com.chenhao.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer id);
}
