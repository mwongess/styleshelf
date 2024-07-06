package com.mwongess.styleshelf.category.service;

import com.mwongess.styleshelf.category.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto getCategoryById(Long categoryId);
    List<CategoryDto> getAllCategories();
    CategoryDto updateCategory(Long categoryId, CategoryDto updatedCategory);
}
