package assignment.lab4.service;

import assignment.lab4.domain.Product;

import java.util.List;

public interface ProductService {
    public void save(Product prod);
    public List<Product> getAll();
}
