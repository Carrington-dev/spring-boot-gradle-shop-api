package com.example.shopapi.services;

import com.example.shopapi.datarepo.ProductRepository;
import com.example.shopapi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(products::add);
        return products;
    }
}
