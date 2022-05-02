package assignment.lab4.controller;

import assignment.lab4.aspect.annotation.ExecutionTime;
import assignment.lab4.domain.Product;
import assignment.lab4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/products")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @ExecutionTime
    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }

    ;
    @ExecutionTime
    @GetMapping()
    public List<Product> getAll() {
        return productService.getAll();
    }

    ;
}
