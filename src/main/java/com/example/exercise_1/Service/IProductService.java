package com.example.exercise_1.Service;

import com.example.exercise_1.model.Product;

import java.util.Optional;

public interface IProductService {
    Product save(Product product);
    void remove(Long id);
    Iterable<Product>findAll();
    Optional<Product>findById(Long id);


}
