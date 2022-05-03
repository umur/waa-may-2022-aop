package com.project.spring.controller;

import com.project.spring.aspect.annotation.ExecutionTime;
import com.project.spring.entity.Category;
import com.project.spring.exception.AopIsAwesomeHeaderException;
import com.project.spring.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @ExecutionTime
    @PostMapping
    public void save
            (@RequestBody Category category, @RequestHeader Map<String, String> headers)
            throws AopIsAwesomeHeaderException {
        String val = headers.get("req");
        System.out.println(val);
        categoryService.save(category);
        if("AOP-IS-AWESOME".equalsIgnoreCase(val)) {
            System.out.println("OK");
        } else {
            throw new AopIsAwesomeHeaderException("NOK!!");
        }
    }
}
