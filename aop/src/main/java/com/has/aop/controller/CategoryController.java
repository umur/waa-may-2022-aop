package com.has.aop.controller;



import com.has.aop.dto.CategoryDto;
import com.has.aop.entity.Category;
import com.has.aop.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping
    public void save(@RequestBody Category p) {
        categoryService.save(p);
    }
    @DeleteMapping
    public void deleteById(@RequestParam int p) {
        categoryService.delete(p);
    }


    @GetMapping
    public List<CategoryDto> getAll() {
        return categoryService.getAll();
    }
    @GetMapping("/{id}")
    public CategoryDto getById(@RequestParam int id) {
        return categoryService.getById(id);
    }

}
