package com.example.casestudymodule.service;

import com.example.casestudymodule.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> selectAllProduct() throws SQLException;
}
