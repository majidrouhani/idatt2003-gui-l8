package edu.ntnu.idatt2003.mvc.basic.model;

import java.util.HashMap;
import java.util.Map;

public class UserModel {
    Map<String, User> users = new HashMap<>();

    public Map<String, User> retrievUserFromDatabase() {        
        users.put("Robert", new User("Robert", "pZUeh@example.com", "Home", "123-45-6789"));
        users.put("John", new User("John", "QyVJt@example.com", "Work", "987-65-4321"));
        users.put("Jane", new User("Jane", "pZUeh@example.com", "Home", "123-45-6789"));
        users.put("Mary", new User("Mary", "QyVJt@example.com", "Work", "987-65-4321"));
        return users;
    }

    public void updateUser(User user){
        users.put(user.getSocialSecurityNumber(), user);
    }
}
