package com.backend.ProdcutsAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.ProdcutsAPI.repository.ProductRepository;

import com.backend.ProdcutsAPI.entity.Product;


@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private final ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product findByID(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }
}
