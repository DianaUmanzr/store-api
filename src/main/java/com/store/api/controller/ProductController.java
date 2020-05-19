package com.store.api.controller;

import com.store.api.entity.Product;
import com.store.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.findAllProducts();
    }

    @PostMapping()
    public String save(@RequestBody Product product){
        productService.saveProduct(product);
        return "ok";
    }

    @PutMapping()
    public String update(@RequestBody Product product){
        productService.saveProduct(product);
        return "ok";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        productService.deleteProduct(id);
        return "Deleted";
    }
}
