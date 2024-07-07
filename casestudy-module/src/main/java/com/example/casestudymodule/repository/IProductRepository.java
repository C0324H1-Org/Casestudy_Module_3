package com.example.casestudymodule.repository;

import com.example.casestudymodule.model.CartDetailDTO;
import com.example.casestudymodule.model.Oder;
import com.example.casestudymodule.model.Product;
import com.example.casestudymodule.model.ProductDetail;

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
}
