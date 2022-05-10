package springdata1.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springdata1.demo.entity_bidir.Category;
import springdata1.demo.entity_bidir.Product;
import springdata1.demo.entity_bidir.joinColumn.Review;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

    public List<Product> findAllByPriceGreaterThan(int minPrice);

    public List<Product> findAllByCategoryAndPriceLessThan(Category cat, int price);

    public List<Product> findAllByNameContaining(String keyword);

    public List<Product> findAllByUserId(int id);

    public List<Product> findByReviews(int id);
}
