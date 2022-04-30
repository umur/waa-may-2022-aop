package edu.miu.springaop.controller;

import edu.miu.springaop.DTO.ProductDto;
import edu.miu.springaop.aspect.annotation.ExecutionTime;
import edu.miu.springaop.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ExecutionTime
    @PostMapping
    public void save(@RequestBody ProductDto p) {
        productService.save(p);
    }

    @ExecutionTime
    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }


    @ExecutionTime
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable int id) {
        return ResponseEntity.ok(productService.getById(id));
    }

    @ExecutionTime
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.deleteById(id);
    }

    @ExecutionTime
    @GetMapping("/price/{minPrice}")
    public List<ProductDto> findByPriceGreaterThan(@PathVariable float minPrice) {
        return productService.findByPriceGreaterThan(minPrice);
    }

    @ExecutionTime
    @GetMapping("/{category}/{price}")
    public List<ProductDto> findByCategoryAndPriceLessThan(@PathVariable String category, @PathVariable float price){

        return productService.findByCategoryAndPriceLessThan(category, price);
    }
    @ExecutionTime
    @GetMapping("/name/{name}")
    public List<ProductDto> findByNameContaining(@PathVariable String name){
        return productService.findByNameContaining(name);
    }

//    @ExecutionTime
//    @GetMapping("/user/{id}")
//    public ResponseEntity<?> getProductByUserId(@PathVariable long id) {
//        return new ResponseEntity<>(productService.getProductsByUserId(id), HttpStatus.OK);
//    }

    @ExecutionTime
    @GetMapping("/{id}/reviews")
    public ResponseEntity<?> getReviewByProductId(@PathVariable int id) {
        return new ResponseEntity<>(productService.getReviewByProductId(id), HttpStatus.OK);
    }



}
