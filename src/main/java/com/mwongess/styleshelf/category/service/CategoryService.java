package com.mwongess.styleshelf.category.service;

import com.mwongess.styleshelf.category.dto.CategoryDto;
import org.springframework.stereotype.Service;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);
}
