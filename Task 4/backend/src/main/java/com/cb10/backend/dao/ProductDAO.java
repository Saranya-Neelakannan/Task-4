package com.cb10.backend.dao;

import com.cb10.backend.entity.Product;

import java.util.List;

public interface ProductDAO {
    public List<Product> findAll();
    public Product findByName(String name);
    public void add(Product product);
    public void update(Product product);
    public void delete(Product product);
}
