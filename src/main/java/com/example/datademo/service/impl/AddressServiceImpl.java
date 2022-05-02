package com.example.datademo.service.impl;

import com.example.datademo.entity.Address;
import com.example.datademo.entity.Category;
import com.example.datademo.repository.AddressRepository;
import com.example.datademo.repository.CategoryRepository;
import com.example.datademo.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }

    @Override
    public Iterable<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address getById(int id) {
        Optional<Address> result = addressRepository.findById(id);
        if(result.isPresent()){
            return result.get();
        }else{
            return null;
        }
    }

    @Override
    public void update(Address a, int id) {
        Address add = addressRepository.findById(id).get();
        add.setId(a.getId());
        add.setCity(a.getCity());
        add.setStreet(a.getStreet());
        add.setUser(a.getUser());
        add.setZip(a.getZip());
        addressRepository.save(add);
    }

    @Override
    public void delete(int id) {
        Address add = addressRepository.findById(id).get();
        addressRepository.delete(add);
    }

    @Override
    public void save(Address a) {
        addressRepository.save(a);
    }
}
