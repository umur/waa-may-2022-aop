package com.example.demo.repository.impl;

import com.example.demo.entity.bidirect.Customer;
import com.example.demo.repository.CustomerRepo;

public abstract class CustomerRepo1 implements CustomerRepo {
    @Override
    public Customer geoorgfdgfhgh(String firstName1) {
        Customer c= new Customer();
        c.setFirstname(firstName1);
        return c;
    }
}
