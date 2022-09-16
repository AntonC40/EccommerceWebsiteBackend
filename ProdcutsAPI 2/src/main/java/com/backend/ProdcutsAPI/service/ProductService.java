package com.backend.ProdcutsAPI.service;

import com.backend.ProdcutsAPI.entity.Product;

public interface ProductService {
    Product findByID( int id);
}
