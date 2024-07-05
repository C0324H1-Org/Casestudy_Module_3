package com.codegym.phonestore.service;

import com.codegym.phonestore.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> selectAllProduct() throws SQLException;
}
