package com.mwongess.styleshelf.category.repository;

import com.mwongess.styleshelf.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long>{
}
