package com.codegym.istore.service.impl;

import com.codegym.istore.model.Product;
import com.codegym.istore.repository.IProductRepository;
import com.codegym.istore.repository.impl.ProductRepository;
import com.codegym.istore.service.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {

    IProductRepository productRepositories = new ProductRepository();
    @Override
    public List<Product> selectAllProduct() throws SQLException {
        return productRepositories.selectAll();
    }
}
