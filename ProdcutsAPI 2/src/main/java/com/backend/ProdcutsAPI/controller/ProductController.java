package com.backend.ProdcutsAPI.controller;

import com.backend.ProdcutsAPI.repository.ProductRepository;
import com.backend.ProdcutsAPI.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ProductController {
    final ProductRepository productRepository;

    public ProductController(@Autowired ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Iterable<Product> getItems(){
        return productRepository.findAll();
    }
}
