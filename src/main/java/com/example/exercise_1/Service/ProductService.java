package com.example.exercise_1.Service;

import com.example.exercise_1.model.Product;
import com.example.exercise_1.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository productService;
    @Override
    public Product save(Product product) {
        return productService.save(product);
    }

    @Override
    public void remove(Long id) {
       productService.deleteById(id);
    }

    @Override
    public Iterable<Product> findAll() {
        return productService.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productService.findById(id);
    }


}
