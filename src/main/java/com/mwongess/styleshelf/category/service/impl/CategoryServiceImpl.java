package com.mwongess.styleshelf.category.service.impl;

import com.mwongess.styleshelf.category.dto.CategoryDto;
import com.mwongess.styleshelf.category.exception.ResourceNotFoundException;
import com.mwongess.styleshelf.category.mapper.CategoryMapper;
import com.mwongess.styleshelf.category.model.Category;
import com.mwongess.styleshelf.category.repository.CategoryRepository;
import com.mwongess.styleshelf.category.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.mapToCategory(categoryDto);
        Category savedCategory = categoryRepository.save(category);
        return CategoryMapper.mapToCategoryDto(savedCategory);
    }

    @Override
    public CategoryDto getCategoryById(Long categoryId) {
       Category category =  categoryRepository.findById(categoryId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category doesn't exist"));
        return CategoryMapper.mapToCategoryDto(category);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(CategoryMapper::mapToCategoryDto)
                .collect(Collectors.toList());
    }
}
