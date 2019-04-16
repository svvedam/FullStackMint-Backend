package com.mint.backend.mint.Service;

import com.mint.backend.mint.Entity.Category;
import com.mint.backend.mint.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(Category category) {

        return categoryRepository.save(category);
    }

}
