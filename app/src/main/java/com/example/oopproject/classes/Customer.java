package com.example.oopproject.classes;

import com.example.oopproject.interfaces.ToMap;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Customer extends Person implements ToMap {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("password", this.getPassword());
        result.put("name", this.getName());
        result.put("phoneNumber", this.getPhoneNumber());
        result.put("address", this.getAddress());

        return result;
    }

    public Customer(String phoneNumber, String name, String password, Address address) {
        super(phoneNumber, name, password);
        this.address = address;
    }
}
