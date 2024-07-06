package com.example.casestudymodule.repositories.iml;

import com.example.casestudymodule.model.CartDetailDTO;
import com.example.casestudymodule.model.Oder;
import com.example.casestudymodule.model.Product;
import com.example.casestudymodule.model.ProductDetail;
import com.example.casestudymodule.repositories.IProductRepositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositories implements IProductRepositories {

    private static final String INSERT_USERS_SQL = "INSERT INTO product_detail (product_id, color_id, ram_id, rom_id, display, camera, battery) VALUES (?,?,?,?,?,?,?);";
    private static final String INSERT_ODER = "INSERT INTO orders (customer_id, product_detail_id) VALUES (?,?);";
    private static final String SELECT_CUSTOMER_BY_ID = "SELECT customer_id FROM casestudy_module_3.customer;";
    private static final String SELECT_DETAIL_BY_ID = "SELECT product_detail_id FROM casestudy_module_3.product_detail ORDER BY product_detail_id DESC LIMIT 1;";
    private static final String SELECT_CART_DETAIL = "CALL casestudy_module_3.GetOrderDetails();";
    private static final String SELECT_ALL_PRODUCTS_IPHONE = "select * from casestudy_module_3.product WHERE category_id = 1";
    private static final String SELECT_ALL_PRODUCTS_MAC = "select * from casestudy_module_3.product WHERE category_id = 2";
    private static final String SELECT_ALL = "SELECT * FROM casestudy_module_3.product";
    private static final String SELECT_SEARCH = "SELECT * FROM casestudy_module_3.product WHERE product_name LIKE ?";
    private static final String DELETE_CART = "CALL  casestudy_module_3.delete_all_orders();";
    private static final String DELETE_PRODUCT_DETAIL = "CALL casestudy_module_3.delete_all_product();";
    private static final String ORDER_BY_NAME_DESC = "select * from users ORDER BY name DESC;";
    private static final String ORDER_BY_NAME_ASC = "select * from users ORDER BY name ASC;";


    @Override
    public List<Product> selectAll() throws SQLException {
        List<Product> products = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepositories.getConnection().prepareStatement(SELECT_ALL_PRODUCTS_IPHONE)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            int productId;
            String productName;
            String producer;
            String description;
            int price;
            String image;
            while (resultSet.next()) {
                productId = resultSet.getInt("product_id");
                productName = resultSet.getString("product_name");
                producer = resultSet.getString("producer");
                description = resultSet.getString("description");
                price = resultSet.getInt("price");
                image = resultSet.getString("image");
                products.add(new Product(productId,productName, producer, description, price, image));
            }
        }
        return products;
    }

    @Override
    public void buyProduct(ProductDetail productDetail) throws SQLException {
        try (PreparedStatement preparedStatement = BaseRepositories.getConnection().prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, productDetail.getProductId());
            preparedStatement.setInt(2,productDetail.getProductColorId());
            preparedStatement.setInt(3,productDetail.getProductRamId());
            preparedStatement.setInt(4,productDetail.getProductRomId());
            preparedStatement.setString(5,productDetail.getDisplay());
            preparedStatement.setString(6,productDetail.getCamera());
            preparedStatement.setString(7,productDetail.getBattery());
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public List<CartDetailDTO> cartDetail() {
        List<CartDetailDTO> cartDetailDTOs = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepositories.getConnection().prepareStatement(SELECT_CART_DETAIL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            String image;
            String productName;
            String producer;
            String ram;
            String rom;
            String color;
            int price;
            String customerName;
            String customerPhone;
            String customerAddress;
            int quantily;
            while (resultSet.next()) {
                image = resultSet.getString("image");
                productName = resultSet.getString("name");
                producer = resultSet.getString("producer");
                ram = resultSet.getString("ram");
                rom = resultSet.getString("rom");
                color = resultSet.getString("color");
                price = resultSet.getInt("price");
                customerName = resultSet.getString("customer_name");
                customerPhone = resultSet.getString("customer_phone");
                customerAddress = resultSet.getString("customer_address");
                cartDetailDTOs.add(new CartDetailDTO(image, productName, producer, ram, rom, color, price, customerName, customerPhone, customerAddress));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cartDetailDTOs;
    }

    @Override
    public int searchByIdCustomer() {
        int customerId = 0;
        try (PreparedStatement preparedStatement = BaseRepositories.getConnection().prepareStatement(SELECT_CUSTOMER_BY_ID)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                customerId = resultSet.getInt("customer_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerId;
    }

    @Override
    public void pushOder(Oder oder) {
        try (PreparedStatement preparedStatement = BaseRepositories.getConnection().prepareStatement(INSERT_ODER)) {
            preparedStatement.setInt(1, oder.getCustomerId());
            preparedStatement.setInt(2, oder.getProductId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int searchByIdProduct() {
        int productDetailId = 0;
        try (PreparedStatement preparedStatement = BaseRepositories.getConnection().prepareStatement(SELECT_DETAIL_BY_ID)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                productDetailId = resultSet.getInt("product_detail_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productDetailId;
    }

    @Override
    public List<Product> selectAllProductMac() {
        List<Product> products = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepositories.getConnection().prepareStatement(SELECT_ALL_PRODUCTS_MAC)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            int productId;
            String productName;
            String producer;
            String description;
            int price;
            String image;
            while (resultSet.next()) {
                productId = resultSet.getInt("product_id");
                productName = resultSet.getString("product_name");
                producer = resultSet.getString("producer");
                description = resultSet.getString("description");
                price = resultSet.getInt("price");
                image = resultSet.getString("image");
                products.add(new Product(productId,productName, producer, description, price, image));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public List<Product> selectAllItem() {
        List<Product> products = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepositories.getConnection().prepareStatement(SELECT_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            int productId;
            String productName;
            String producer;
            String description;
            int price;
            String image;
            while (resultSet.next()) {
                productId = resultSet.getInt("product_id");
                productName = resultSet.getString("product_name");
                producer = resultSet.getString("producer");
                description = resultSet.getString("description");
                price = resultSet.getInt("price");
                image = resultSet.getString("image");
                products.add(new Product(productId,productName, producer, description, price, image));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public List<Product> search(String search) {
        List<Product> products = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepositories.getConnection().prepareStatement(SELECT_SEARCH)) {
            preparedStatement.setString(1, "%"+search+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            int productId;
            String productName;
            String producer;
            String description;
            int price;
            String image;
            while (resultSet.next()) {
                productId = resultSet.getInt("product_id");
                productName = resultSet.getString("product_name");
                producer = resultSet.getString("producer");
                description = resultSet.getString("description");
                price = resultSet.getInt("price");
                image = resultSet.getString("image");
                products.add(new Product(productId,productName, producer, description, price, image));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
        }
    }

