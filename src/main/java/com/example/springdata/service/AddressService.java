package com.example.springdata.service;

import com.example.springdata.entity.Address;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public interface AddressService {
    public Address save(Address address);

    public void delete(Integer id);

    public Address getById(Integer id);

    public List<Address> getAll();
}
