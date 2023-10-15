package com.example.StudentApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentApp.model.Address;
import com.example.StudentApp.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public List<Address> getAddresses(){
        
        List<Address> addresses = new ArrayList<Address>();

        addressRepository.findAll().forEach(address -> {
            addresses.add(address);
        });

        return addresses;
    }

    public Address getAddress(Integer id) {
        return addressRepository.findById(id).orElse(null);
    }

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public void deleteAddress(Integer id) {
        addressRepository.deleteById(id);
    }

    public void updateAddress(Address address, Integer id) {
        addressRepository.save(address);
    }

}
