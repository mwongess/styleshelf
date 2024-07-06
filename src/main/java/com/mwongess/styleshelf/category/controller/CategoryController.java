package com.mwongess.styleshelf.category.controller;

import com.mwongess.styleshelf.category.dto.CategoryDto;
import com.mwongess.styleshelf.category.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryDto> createCategory(@RequestBody  CategoryDto categoryDto){
       CategoryDto savedCategory =  categoryService.createCategory(categoryDto);
       return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable("id") Long categoryId){
       CategoryDto categoryDto = categoryService.getCategoryById((categoryId));
       return ResponseEntity.ok(categoryDto);
    }
}
