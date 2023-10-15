package com.example.StudentApp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentApp.model.Address;
import com.example.StudentApp.service.AddressService;


@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/addresses")
    public List<Address> getAddresses(){
        return addressService.getAddresses();  
    }

    @RequestMapping("/address/{id}")
    public Address getAddress(@PathVariable Integer id){
        return addressService.getAddress(id);
    }
    
    @RequestMapping("/addAddress")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @RequestMapping("/deleteAddress/{id}")
    public void deleteAddress(@PathVariable Integer id){
        addressService.deleteAddress(id);
    }
    
    @RequestMapping("/updateAddress/{id}")
    public void updateAddress(@RequestBody Address address,@PathVariable Integer id){
        addressService.updateAddress(address, id);
    }
}
