package com.example.lab4.dto;

import com.example.lab4.domain.Address;
import com.example.lab4.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private int id;
    private String street;
    private String zip;
    private User user;

    public Address AddressDtoToAddress(AddressDTO addressDTO){

        Address address = new Address();
        address.setId(addressDTO.getId());
        address.setStreet(addressDTO.getStreet());
        address.setZip(addressDTO.getZip());
        address.setUser(addressDTO.getUser());

        return  address;
    }

    public AddressDTO AddressToAddressDto(Address address){

        AddressDTO addressDto = new AddressDTO();

        addressDto.setId(address.getId());
        addressDto.setStreet(address.getStreet());
        addressDto.setZip(address.getZip());
        addressDto.setUser(address.getUser());

        return addressDto;
    }
}


