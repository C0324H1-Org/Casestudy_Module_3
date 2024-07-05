package com.example.casestudymodule.repositories;

import com.example.casestudymodule.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepositories {

    List<Product> selectAll() throws SQLException;
}
