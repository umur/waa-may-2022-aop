package com.lab.springdata.service;

import com.lab.springdata.entity.Product;
import com.lab.springdata.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
   private final ProductRepo productRepo;

    public void save(Product p){
        productRepo.save(p);
    }
    public void saveAll(List<Product> listProduct){
        productRepo.saveAll(listProduct);
    }
    public void deleteById(int id){
        productRepo.deleteById(id);
    }
    public Product getById(int id){
        return productRepo.findById(id);
    }
    public List<Product> getAll(){
        return productRepo.findAll();
    }
    public List<Product> getByMinPrice(double minPrice){
        return productRepo.findAllByPriceGreaterThan(minPrice);
    }
    public List<Product> getByCatAndMaxPrice(String cat, double maxPrice){
        return productRepo.findAllByCategory_NameEqualsIgnoreCaseAndPriceLessThan(cat, maxPrice);
    }
    public List<Product> getByNameHas(String keyword){
        return productRepo.findAllByNameContainsIgnoreCase(keyword);
    }
    public List<Product> getByCreatorId(int id){
        return productRepo.findAllByCreator_Id(id);
    }
   
}
