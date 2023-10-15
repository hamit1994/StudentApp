package com.example.StudentApp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student", schema = "public")
public class Student {
    @Id
    private Integer id;
    private String first_name;
    private String last_name;
    private Integer phone;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address", referencedColumnName = "id")
    private Address address;

    public Student(Integer id, String first, String last, String mail, Integer phone){
        this.id = id;
        this.first_name = first;
        this.last_name = last;
        this.email = mail;
        this.phone = phone;
    }

    public Student(){
        
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id_person) {
        this.id = id_person;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String firstName) {
        this.first_name = firstName;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String lastName) {
        this.last_name = lastName;
    }

    public Integer getPhone() {
        return this.phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }
}
