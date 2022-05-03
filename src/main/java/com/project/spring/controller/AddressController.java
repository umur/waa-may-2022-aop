package com.project.spring.controller;

import com.project.spring.entity.Address;
import com.project.spring.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAll() {
        return addressService.getAll();
    }

    @PostMapping
    public void save(@RequestBody Address address) {
        addressService.save(address);
    }
}
