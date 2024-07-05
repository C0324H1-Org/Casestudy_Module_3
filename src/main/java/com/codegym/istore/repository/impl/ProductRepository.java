package com.codegym.istore.repository.impl;

import com.codegym.istore.model.Product;
import com.codegym.istore.repository.IProductRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, country) VALUES (?,?,?);";
    private static final String SELECT_USER_BY_ID = "select id, name, email, country from users where id = ?";
    private static final String SELECT_USER_BY_NAME = "select id, name, email, country from users where country = ?";
    private static final String SELECT_ALL_USERS = "select * from casestudy_module_3.product";
    private static final String DELETE_USER_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?, email = ?, country = ? where id = ?;";
    private static final String ORDER_BY_NAME_DESC = "select * from users ORDER BY name DESC;";
    private static final String ORDER_BY_NAME_ASC = "select * from users ORDER BY name ASC;";


    @Override
    public List<Product> selectAll() throws SQLException {
        List<Product> products = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement(SELECT_ALL_USERS);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            String productName;
            String producer;
            String description;
            int price;
            String image;
            while (resultSet.next()) {
                productName = resultSet.getString("product_name");
                producer = resultSet.getString("producer");
                description = resultSet.getString("description");
                price = resultSet.getInt("price");
                image = resultSet.getString("image");
                products.add(new Product(productName, producer, description, price, image));
            }
        }
        return products;
    }
}
