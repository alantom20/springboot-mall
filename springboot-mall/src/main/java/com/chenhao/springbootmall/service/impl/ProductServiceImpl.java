package com.chenhao.springbootmall.service.impl;

import com.chenhao.springbootmall.dao.ProductDao;
import com.chenhao.springbootmall.dta.ProductRequest;
import com.chenhao.springbootmall.model.Product;
import com.chenhao.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
       productDao.updateProduct(productId,productRequest);
    }
}
