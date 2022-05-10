package springdata1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springdata1.demo.aspect.annotation.ExecutionTime;
import springdata1.demo.entity_bidir.Category;
import springdata1.demo.entity_bidir.Product;
import springdata1.demo.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ExecutionTime
    @GetMapping("/price/{minPrice}")
    public List<Product> getProductsByPrice(@PathVariable int minPrice){
        return productService.getAllGreaterThan(minPrice);
    }

    @ExecutionTime
    @GetMapping("/{cat}/{price}")
    public List<Product> getSpecificProduct(@PathVariable Category cat, @PathVariable int price){
        return productService.getSpecific(cat, price);
    }

    @ExecutionTime
    @GetMapping("/{keyword}")
    public List<Product> getProductByKeyword(@PathVariable String keyword){
        return productService.getSpecificKeyword(keyword);
    }

    @ExecutionTime
    @GetMapping("/user/{id}")
    public List<Product> getProductByUserId(@PathVariable int id){
        return productService.getByUser(id);
    }

    @ExecutionTime
    @GetMapping("/review/{id}")
    public List<Product> getReviews(@PathVariable int id){
        return productService.getReview(id);
    }

}
