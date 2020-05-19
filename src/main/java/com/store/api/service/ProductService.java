package com.store.api.service;

import com.store.api.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProducts();

    public void saveProduct(Product product);

    public void deleteProduct(int id);
}
