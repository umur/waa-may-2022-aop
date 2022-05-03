package com.example.demo.service;

import com.example.demo.entity.bidirect.Customer;
import com.example.demo.entity.bidirect.Product;
import com.example.demo.repository.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;

    public Customer  fgfgfgfgfg(String c){
       // customerRepo.save(c);
//        customerRepo.findAll()
       // customerRepo.flush();
      customerRepo.getCustomerByEmailAndAddressContaining("","");
      return  customerRepo.geoorgfdgfhgh("geo");
    }
    public List<Product> findByIdProductsByReviewsProduct(int customerId){
     //   return customerRepo.getProductsByReviewsProductByCustomerId(customerId);
    return null;
    }
}
