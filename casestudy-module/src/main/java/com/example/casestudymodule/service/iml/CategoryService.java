package com.example.casestudymodule.service.iml;

import com.example.casestudymodule.model.Category;
import com.example.casestudymodule.repository.ICategoryRepository;
import com.example.casestudymodule.repository.IUserRepository;
import com.example.casestudymodule.repository.iml.CategoryRepository;
import com.example.casestudymodule.repository.iml.UserRepository;
import com.example.casestudymodule.service.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
    private static final ICategoryRepository categoryRepository = new CategoryRepository();

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.getAllCategory();
    }
}
