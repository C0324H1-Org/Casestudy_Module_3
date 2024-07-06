package com.example.casestudymodule.service.iml;

import com.example.casestudymodule.model.CartDetailDTO;
import com.example.casestudymodule.model.Oder;
import com.example.casestudymodule.model.Product;
import com.example.casestudymodule.model.ProductDetail;
import com.example.casestudymodule.repositories.IProductRepositories;
import com.example.casestudymodule.repositories.iml.ProductRepositories;
import com.example.casestudymodule.service.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {

    IProductRepositories productRepositories = new ProductRepositories();
    @Override
    public List<Product> selectAllProduct() throws SQLException {
        return productRepositories.selectAll();
    }

    @Override
    public void buyProduct(ProductDetail productDetail) throws SQLException {
        productRepositories.buyProduct(productDetail);
    }

    @Override
    public List<CartDetailDTO> cartDetail() {
        return productRepositories.cartDetail();
    }

    @Override
    public int searchByIdCustomer() {
        return productRepositories.searchByIdCustomer();
    }

    @Override
    public void pushOder(Oder oder) {
        productRepositories.pushOder(oder);
    }

    @Override
    public int searchByIdProduct() {
        return productRepositories.searchByIdProduct();
    }

    @Override
    public List<Product> selectAllProductMac() {
        return productRepositories.selectAllProductMac();
    }

    @Override
    public List<Product> selectAll() {
        return productRepositories.selectAllItem();
    }

    @Override
    public List<Product> search(String search) {
        return productRepositories.search(search);
    }

    @Override
    public void deletePay() {
        productRepositories.deletePay();
    }

    @Override
    public void deleteAll() {
        productRepositories.deleteAll();
    }
}
