package com.example.lab4.service.impl;

import com.example.lab4.dto.AddressDTO;
import com.example.lab4.repository.AddressRepo;
import com.example.lab4.service.AddressService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {


    private final AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addressRepo){
        this.addressRepo=addressRepo;
    }

    @Override
    public void save(AddressDTO addressDTO) {
        AddressDTO addressDTO1 = new AddressDTO();
        var addressObj = addressDTO1.AddressDtoToAddress(addressDTO);
        addressRepo.save(addressObj);
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }

    @Override
    public void update(int id, AddressDTO addressDTO) {
        var address = addressRepo.findById(id);
        if (address.isPresent()){
            address.get().setStreet(addressDTO.getStreet());
            address.get().setZip(addressDTO.getZip());
            address.get().setUser(addressDTO.getUser());
            addressRepo.save(address.get());
        }
    }

    @Override
    public AddressDTO getById(int id) {
        var res= addressRepo.findById(id);

        AddressDTO addressDTO = new AddressDTO();


        //return res.isPresent() ? addressDTO.AddressToAddressDto(res): null;
        return  null;

    }

    @Override
    public List<AddressDTO> getAll() {
        return  null;
    }
}
