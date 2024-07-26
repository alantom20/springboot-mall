package com.chenhao.springbootmall.service;

import com.chenhao.springbootmall.constant.ProductCategory;
import com.chenhao.springbootmall.dta.ProductRequest;
import com.chenhao.springbootmall.model.Product;

import java.util.List;


public interface ProductService {
    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
