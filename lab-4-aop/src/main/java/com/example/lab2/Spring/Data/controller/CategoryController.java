package com.example.lab2.Spring.Data.controller;

import com.example.lab2.Spring.Data.Service.CategoryService;
import com.example.lab2.Spring.Data.entity.Category;
import com.example.lab2.Spring.Data.repository.CategoryRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    CategoryService categoryService;

    @GetMapping
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }

    @PostMapping
    public void createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public void updateCategory(@RequestBody Category category, @PathVariable("id") int id) {
        categoryService.updateCategory(category, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") int id) {
        categoryService.deleteCategory(id);
    }
}
