package edu.miu.springdata.service;

import edu.miu.springdata.DTO.AddressDto;

import java.util.List;

public interface AddressService {

    void save(AddressDto p);
    void deleteById(int id);
    AddressDto getById(int id);
    List<AddressDto> getAll();

}
