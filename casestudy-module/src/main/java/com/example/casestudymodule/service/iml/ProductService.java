package com.example.casestudymodule.service.iml;

import com.example.casestudymodule.model.Product;
import com.example.casestudymodule.repositories.IProductRepositories;
import com.example.casestudymodule.repositories.iml.ProductRepositories;
import com.example.casestudymodule.service.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {

    IProductRepositories productRepositories = new ProductRepositories();
    @Override
    public List<Product> selectAllProduct() throws SQLException {
        return productRepositories.selectAll();
    }
}
