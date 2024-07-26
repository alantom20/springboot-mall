package com.chenhao.springbootmall.dao;

import com.chenhao.springbootmall.constant.ProductCategory;
import com.chenhao.springbootmall.dta.ProductRequest;
import com.chenhao.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
