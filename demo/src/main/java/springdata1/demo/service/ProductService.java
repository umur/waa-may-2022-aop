package springdata1.demo.service;

import org.springframework.stereotype.Service;
import springdata1.demo.entity_bidir.Category;
import springdata1.demo.entity_bidir.Product;

import java.util.List;

@Service
public interface ProductService {

    public List<Product> getAllGreaterThan(int minPrice);

    public List<Product> getSpecific(Category cat, int price);

    public List<Product> getSpecificKeyword(String keyword);

    public List<Product> getByUser(int id);

    public List<Product> getReview(int id);

}
