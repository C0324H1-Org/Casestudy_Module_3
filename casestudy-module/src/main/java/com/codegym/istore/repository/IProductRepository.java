package com.codegym.istore.repository;

import com.codegym.istore.model.CartDetailDTO;
import com.codegym.istore.model.Oder;
import com.codegym.istore.model.Product;
import com.codegym.istore.model.ProductDetail;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {

    List<Product> selectAll() throws SQLException;

    void buyProduct(ProductDetail productDetail) throws SQLException;

    List<CartDetailDTO> cartDetail();

    int searchByIdCustomer();

    void pushOder(Oder oder);

    int searchByIdProduct();

    List<Product> selectAllProductMac();

    List<Product> selectAllItem();

    List<Product> search(String search);

    List<Product> getProductByCategory(int idCategory);

    void deletePay();

    void deleteAll();

    boolean DeleteOder(int id);


}