package com.example.casestudymodule.controller;

import com.example.casestudymodule.model.Category;
import com.example.casestudymodule.model.Product;
import com.example.casestudymodule.service.ICategoryService;
import com.example.casestudymodule.service.IProductService;
import com.example.casestudymodule.service.iml.CategoryService;
import com.example.casestudymodule.service.iml.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CategoryController", urlPatterns = "/category")
public class CategoryController extends HttpServlet {
    private static final ICategoryService categoryService = new CategoryService();
    IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int idCategory = Integer.parseInt(req.getParameter("idCategory"));

        List<Product> products = productService.getProductByCategory(idCategory);
        List<Category> categories = categoryService.getAllCategory();


        req.setAttribute("listProduct", products);
        req.setAttribute("categories", categories);
        req.setAttribute("tag", idCategory);
        req.getRequestDispatcher("product/product.jsp").forward(req, resp);
    }
}
