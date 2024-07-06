package com.mwongess.styleshelf.category.service.impl;

import com.mwongess.styleshelf.category.dto.CategoryDto;
import com.mwongess.styleshelf.category.mapper.CategoryMapper;
import com.mwongess.styleshelf.category.model.Category;
import com.mwongess.styleshelf.category.repository.CategoryRepository;
import com.mwongess.styleshelf.category.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}
