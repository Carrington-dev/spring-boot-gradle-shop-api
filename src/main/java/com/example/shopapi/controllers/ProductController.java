package com.example.shopapi.controllers;

import com.example.shopapi.models.Product;
import com.example.shopapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService = new ProductService();

    @GetMapping("/")
    public String getHome(){
        return "<h1>Welcome To Oftmart APIs</h1>";
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
