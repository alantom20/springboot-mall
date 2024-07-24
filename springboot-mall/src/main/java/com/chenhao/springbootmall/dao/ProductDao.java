package com.chenhao.springbootmall.dao;

import com.chenhao.springbootmall.dta.ProductRequest;
import com.chenhao.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer id);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);
}
