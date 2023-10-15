package com.example.StudentApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address", schema = "public")
public class Address {

    @Id
    private Integer id;
    private String street;
    private String city;
    private String state;
    private Integer postal_code;
    private String country;

    @OneToOne(mappedBy = "address")
    private Student student;

    public Address(Integer id, String street, String city, String state, Integer postal_code, String country){
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postal_code = postal_code;
        this.country = country;
    }

    public Address(){
        
    }

    public Integer getId_location() {
        return this.id;
    }

    public void setId_location(Integer id_location) {
        this.id = id_location;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPostal_code() {
        return this.postal_code;
    }

    public void setPostal_code(Integer postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}