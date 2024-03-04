package edu.ntnu.idatt2003.mvc.basic.controller;

import edu.ntnu.idatt2003.mvc.basic.model.User;
import edu.ntnu.idatt2003.mvc.basic.model.UserModel;
import edu.ntnu.idatt2003.mvc.basic.view.UserView;

public class UserController {
    private UserModel userModel;
    private UserView userView;

    public UserController(UserModel userModel, UserView userView){
        this.userModel = userModel;
        this.userView = userView;
    }

    public void viewUsers(){
        userView.printAllUsers(userModel.retrievUserFromDatabase());
    }

    public void updateUser(User user){
        userModel.updateUser(user);
    }

}
