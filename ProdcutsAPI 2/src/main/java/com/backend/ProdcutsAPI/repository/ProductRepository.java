package com.backend.ProdcutsAPI.repository;

import org.springframework.data.repository.CrudRepository;

import com.backend.ProdcutsAPI.entity.Product;

public interface ProductRepository
    extends CrudRepository<Product, Integer>
{
    
}