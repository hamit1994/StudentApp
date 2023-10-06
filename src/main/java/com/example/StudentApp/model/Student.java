package com.example.StudentApp.model;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private String adresse;
    private String mail;
    private long phone;
    
    public Student(long id, String first, String last, String adr, String mail, long phone){
        this.id = id;
        this.firstName = first;
        this.lastName = last;
        this.adresse = adr;
        this.mail = mail;
        this.phone = phone;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getPhone() {
        return this.phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    } 
}
