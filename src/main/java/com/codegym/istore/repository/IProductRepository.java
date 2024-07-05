package com.codegym.istore.repository;

import com.codegym.istore.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {

    List<Product> selectAll() throws SQLException;
}
