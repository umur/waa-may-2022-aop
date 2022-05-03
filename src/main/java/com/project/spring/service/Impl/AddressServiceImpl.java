package com.project.spring.service.Impl;

import com.project.spring.entity.Address;
import com.project.spring.repository.AddressRepository;
import com.project.spring.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAll() {
        var entity = addressRepository.findAll();

        var result = new ArrayList<Address>();

        entity.forEach(a -> {
            Address address = new Address();
            address.setId(a.getId());
            //address.setUser(a.getUser());
            address.setCity(a.getCity());
            address.setStreet(a.getStreet());
            address.setZip(a.getZip());

            result.add(address);
        });

        return result;
    }

    @Override
    public void save(Address address) {
        addressRepository.save(address);
    }
}
