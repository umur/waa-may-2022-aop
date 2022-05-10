package springdata1.demo.service.impl;

import org.springframework.stereotype.Service;
import springdata1.demo.entity_bidir.Category;
import springdata1.demo.entity_bidir.Product;
import springdata1.demo.repository.ProductRepo;
import springdata1.demo.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
    public List<Product> getAllGreaterThan(int minPrice){
        return productRepo.findAllByPriceGreaterThan(minPrice);
    }

    public List<Product> getSpecific(Category cat, int price){
        return productRepo.findAllByCategoryAndPriceLessThan(cat, price);
    }

    public List<Product> getSpecificKeyword(String keyword){
        return productRepo.findAllByNameContaining(keyword);
    }

    public List<Product> getByUser(int id){
        return productRepo.findAllByUserId(id);
    }

    public List<Product> getReview(int id){
        return productRepo.findByReviews(id);
    }

}
