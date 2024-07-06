package com.mwongess.styleshelf.category.mapper;

import com.mwongess.styleshelf.category.dto.CategoryDto;
import com.mwongess.styleshelf.category.model.Category;

public class CategoryMapper {
    public static CategoryDto mapToCategoryDto(Category category){
        return new CategoryDto(
                category.getId(),
                category.getName()
        );
    }
    public static Category mapToCategory(CategoryDto categoryDto){
        return new Category(
                categoryDto.getId(),
                categoryDto.getName()
        );
    }

}
