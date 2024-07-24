package com.chenhao.springbootmall.service;

import com.chenhao.springbootmall.dta.ProductRequest;
import com.chenhao.springbootmall.model.Product;


public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
