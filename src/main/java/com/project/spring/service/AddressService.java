package com.project.spring.service;

import com.project.spring.entity.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    List<Address> getAll();

    void save(Address address);
}
