package edu.ntnu.idatt2003.mvc.basic.model;

public class User {
    final private String name;
    final private String email;
    final private String address;
    final private String socialSecurityNumber;

    public User(String name, String email, String address, String socialSecurityNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
