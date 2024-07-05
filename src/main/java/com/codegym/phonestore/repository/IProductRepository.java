package com.codegym.phonestore.repository;

import com.codegym.phonestore.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {

    List<Product> selectAll() throws SQLException;
}
