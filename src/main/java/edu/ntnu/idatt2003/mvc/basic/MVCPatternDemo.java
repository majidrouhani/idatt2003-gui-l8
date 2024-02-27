package edu.ntnu.idatt2003.mvc.basic;
// Model
class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// View
class UserView {
    public void printUserDetails(String userName){
        System.out.println("User name: " + userName);
    }
}

// Controller
class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view){
        this.model = model;
        this.view = view;
    }

    public void setUserName(String name){
        model.setName(name);        
    }

    public String getUserName(){
        return model.getName();       
    }

    public void updateView(){                
        view.printUserDetails(model.getName());
    }    
}

// Main application
public class MVCPatternDemo {
    public static void main(String[] args) {
        // Fetch user record based on his roll no from the database
        User model  = retriveUserFromDatabase();

        // Create a view to write user details on console
        UserView view = new UserView();

        UserController controller = new UserController(model, view);

        controller.updateView();

        // Update model data
        controller.setUserName("John Doe");

        controller.updateView();
    }

    private static User retriveUserFromDatabase(){
        User user = new User();
        user.setName("Robert");
        return user;
    }
}