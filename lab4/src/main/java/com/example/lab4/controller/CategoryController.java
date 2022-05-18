package com.example.lab4.controller;


import com.example.lab4.dto.CategoryDTO;
import com.example.lab4.service.CategoryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService=categoryService;
    }

    @GetMapping
    public List<CategoryDTO> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public CategoryDTO getById(@PathVariable int id){
        return categoryService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody CategoryDTO categoryDTO){
        categoryService.save(categoryDTO);
    }

    @DeleteMapping
    public void delete(@PathVariable int id){
        categoryService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody CategoryDTO categoryDTO){
        categoryService.update(id, categoryDTO);
    }
}
