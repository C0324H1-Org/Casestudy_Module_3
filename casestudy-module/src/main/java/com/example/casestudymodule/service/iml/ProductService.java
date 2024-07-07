package com.example.casestudymodule.service.iml;

import com.example.casestudymodule.model.CartDetailDTO;
import com.example.casestudymodule.model.Oder;
import com.example.casestudymodule.model.Product;
import com.example.casestudymodule.model.ProductDetail;
import com.example.casestudymodule.repository.IProductRepository;
import com.example.casestudymodule.repository.iml.ProductRepository;
import com.example.casestudymodule.service.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {

    IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> selectAllProduct() throws SQLException {
        return productRepository.selectAll();

    }

    @Override
    public void buyProduct(ProductDetail productDetail) throws SQLException {
        productRepository.buyProduct(productDetail);
    }

    @Override
    public List<CartDetailDTO> cartDetail() {
        return productRepository.cartDetail();
    }

    @Override
    public int searchByIdCustomer() {
        return productRepository.searchByIdCustomer();
    }

    @Override
    public void pushOder(Oder oder) {
        productRepository.pushOder(oder);
    }

    @Override
    public int searchByIdProduct() {
        return productRepository.searchByIdProduct();
    }

    @Override
    public List<Product> selectAllProductMac() {
        return productRepository.selectAllProductMac();
    }

    @Override
    public List<Product> selectAll() {
        return productRepository.selectAllItem();
    }

    @Override
    public List<Product> search(String search) {
        return productRepository.search(search);
    }

    @Override
    public List<Product> getProductByCategory(int idCategory) {
        return productRepository.getProductByCategory(idCategory);
    }
}
