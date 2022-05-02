package assignment.lab4.service.Impl;

import assignment.lab4.Repo.ProductRepo;
import assignment.lab4.domain.Product;
import assignment.lab4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public void save(Product prod) {
        productRepo.save(prod);
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepo.findAll();
    }
}
