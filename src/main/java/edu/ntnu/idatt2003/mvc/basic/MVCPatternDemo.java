package edu.ntnu.idatt2003.mvc.basic;

import edu.ntnu.idatt2003.mvc.basic.controller.UserController;
import edu.ntnu.idatt2003.mvc.basic.model.User;
import edu.ntnu.idatt2003.mvc.basic.model.UserModel;
import edu.ntnu.idatt2003.mvc.basic.view.UserView;

// Main application
public class MVCPatternDemo {
    public static void main(String[] args) {
        // Create user model and read data
        UserModel userModel  = new UserModel();

        // Create a view to write user details on console
        UserView userView = new UserView();

        // Create a controller
        UserController controller = new UserController(userModel, userView);

        // View user details
        controller.viewUsers();

        // Update user details
        controller.updateUser(new User("Robert", "pZUeh@example.net", "Work", "123-45-6789")); // Update user details();

        // View user details
        controller.viewUsers();
    }
}