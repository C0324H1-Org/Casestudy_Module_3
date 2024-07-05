package com.codegym.istore.service;

import com.codegym.istore.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> selectAllProduct() throws SQLException;
}
