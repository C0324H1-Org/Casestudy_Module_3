package com.codegym.phonestore.service.impl;

import com.codegym.phonestore.model.Product;
import com.codegym.phonestore.repository.IProductRepository;
import com.codegym.phonestore.repository.impl.ProductRepository;
import com.codegym.phonestore.service.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {

    IProductRepository productRepositories = new ProductRepository();
    @Override
    public List<Product> selectAllProduct() throws SQLException {
        return productRepositories.selectAll();
    }
}
