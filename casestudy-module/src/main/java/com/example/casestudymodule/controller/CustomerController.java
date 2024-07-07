package com.example.casestudymodule.controller;

import com.example.casestudymodule.model.*;
import com.example.casestudymodule.service.ICategoryService;
import com.example.casestudymodule.service.IProductService;
import com.example.casestudymodule.service.iml.CategoryService;
import com.example.casestudymodule.service.iml.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerController", urlPatterns = "/istore")
public class CustomerController extends HttpServlet {

    IProductService productService = new ProductService();
    private static final ICategoryService categoryService = new CategoryService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "product":
                try {
                    listProductAll(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "cart":
                try {
                    cartList(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                try {
                    listProduct(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "buy":
                try {
                    buyProduct(request, response);
                    oders(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

                break;
            case "search":
                try {
                    searchProduct(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "pay":
                try {
                    payProduct(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "deleteCustomer":
                break;
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        List<Product> listProduct = productService.selectAllProduct();
        request.setAttribute("listProduct", listProduct);
        List<Product> listProductMac = productService.selectAllProductMac();
        request.setAttribute("listProductMac", listProductMac);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/home.jsp");
        dispatcher.forward(request, response);
    }

    private void listProductAll(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        List<Product> listProduct = productService.selectAll();
        request.setAttribute("listProduct", listProduct);

        String idCategory = request.getParameter("idCategory");

        List<Category> categories = categoryService.getAllCategory();

        request.setAttribute("categories", categories);
        request.setAttribute("tag", idCategory);

        RequestDispatcher dispatcher = request.getRequestDispatcher("product/product.jsp");
        dispatcher.forward(request, response);
    }

    private void buyProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        int ram = Integer.parseInt(request.getParameter("ram"));
        int rom = Integer.parseInt(request.getParameter("rom"));
        int color = Integer.parseInt(request.getParameter("color"));
        String display = request.getParameter("display");
        String camera = request.getParameter("camera");
        String battery = request.getParameter("battery");

        ProductDetail productDetail = new ProductDetail(productId, ram, rom, color, display, camera, battery);
        productService.buyProduct(productDetail);
    }

    private void oders(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int productId = productService.searchByIdProduct();
        int customerId = productService.searchByIdCustomer();
        Oder oder = new Oder(customerId, productId);
        productService.pushOder(oder);
        response.sendRedirect("/istore");
    }

    private void cartList(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        List<CartDetailDTO> cartDetailDTOS = productService.cartDetail();
        request.setAttribute("cartDetailDTOS", cartDetailDTOS);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/cart.jsp");
        dispatcher.forward(request, response);
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        String search = request.getParameter("search");
        List<Product> listProduct = productService.search(search);
        request.setAttribute("listProduct", listProduct);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/product.jsp");
        dispatcher.forward(request, response);
    }

    private void payProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/pay.jsp");
        dispatcher.forward(request, response);

    }
}
