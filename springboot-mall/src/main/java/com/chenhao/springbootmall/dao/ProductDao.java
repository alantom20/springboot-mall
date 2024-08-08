package com.chenhao.springbootmall.dao;

import com.chenhao.springbootmall.dto.ProductQueryParams;
import com.chenhao.springbootmall.dto.ProductRequest;
import com.chenhao.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer id);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void updateStock(Integer productId,Integer stock);

    void deleteProductById(Integer productId);
}
