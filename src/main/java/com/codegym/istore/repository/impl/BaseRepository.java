package com.codegym.istore.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {

    private static String jdbcURL = "jdbc:mysql://localhost:3306/casestudy_module_3?useSSL=false";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "root";
    private static Connection connection = null;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private BaseRepository() {
    }

    public static Connection getConnection() {
        return connection;
    }
}
