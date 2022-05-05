package com.has.aop.service;



import com.has.aop.dto.AddressDto;
import com.has.aop.entity.Address;

import java.util.List;


public interface AddressService {
    void save(Address p);

    void delete(int id);

    AddressDto getById(int id);

    List<AddressDto> getAll();
}
