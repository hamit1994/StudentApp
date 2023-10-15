package com.example.StudentApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.StudentApp.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer>{
    
}
