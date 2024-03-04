package edu.ntnu.idatt2003.mvc.basic.view;

import java.util.Map;

import edu.ntnu.idatt2003.mvc.basic.model.User;

public class UserView {

    public void printUserDetails(String ssn,User user){
        System.out.println("User SSN: " + ssn);
        System.out.println("User name: " + user.getName());
        System.out.println("User email: " + user.getEmail());
        System.out.println("User address: " + user.getAddress());
    }

    public void printAllUsers(Map<String, User> users){
        for (Map.Entry<String, User> entry : users.entrySet()) {
            String ssn = entry.getKey();
            User user = entry.getValue();        
            printUserDetails(ssn, user);
        }                
    }
}
