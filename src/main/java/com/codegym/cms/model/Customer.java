package com.codegym.cms.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name ="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String userName;


    private String address;


    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "Categorys_id")
    private  Category category;

    public Customer() {}

    public Customer(String userName, String address) {
        this.userName = userName;
        this.address = address;
        this.phoneNumber= phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, userName='%s', address='%s']", id, userName, address,phoneNumber);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public  Category getCategory() {
        return category;
    }

    public void setCategory( Category  Category) {
        this.category =  Category;
    }
}