package com.example.shopapi.datarepo;

import com.example.shopapi.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
