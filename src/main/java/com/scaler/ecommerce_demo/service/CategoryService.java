package com.scaler.ecommerce_demo.service;

import com.scaler.ecommerce_demo.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    CategoryDTO getCategoryById(Long id);

    List<CategoryDTO> getAllCategories();

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO);

    boolean deleteCategory(Long id);
}