package com.example.lab4.controller;


import com.example.lab4.dto.AddressDTO;
import com.example.lab4.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/addresses")
public class AddressController {
    private final AddressService addressService;

    public  AddressController(AddressService addressService){
        this.addressService=addressService;
    }

    @GetMapping
    public List<AddressDTO> getAll(){
        return  addressService.getAll();
    }

    @PostMapping
    public void save(@RequestBody AddressDTO addressDTO){
        addressService.save(addressDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        addressService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody AddressDTO addressDTO){
        addressService.update(id, addressDTO);
    }

    @GetMapping("/{id}")
    public AddressDTO getById(@PathVariable int id){
        return  addressService.getById(id);
    }
}
