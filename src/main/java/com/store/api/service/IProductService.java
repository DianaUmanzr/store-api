package com.store.api.service;

import com.store.api.entity.Product;
import com.store.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IProductService implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }
}
