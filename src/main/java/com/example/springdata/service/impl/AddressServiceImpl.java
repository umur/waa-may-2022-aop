package com.example.springdata.service.impl;

import com.example.springdata.entity.Address;
import com.example.springdata.repository.AddressRepository;
import com.example.springdata.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;

    public Address save(Address address) {
        return addressRepository.save(address);
    }

    public void delete(Integer id) {
        addressRepository.deleteById(id);
    }

    public Address getById(Integer id) {
        return addressRepository.findById(id).orElse(null);
    }

    public List<Address> getAll() {
        return StreamSupport
                .stream(addressRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
