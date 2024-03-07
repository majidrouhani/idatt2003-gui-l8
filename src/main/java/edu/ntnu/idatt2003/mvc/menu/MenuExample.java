package edu.ntnu.idatt2003.mvc.menu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * The MenuExample class is an example of a JavaFX application that demonstrates the usage of menus.
 * It creates a simple GUI with a menu bar containing File, Edit, and View menus.
 * The class also includes event handlers for menu items and a method to display a message in the center of the GUI.
 */
public class MenuExample extends Application {

    private MenuController controller;

    private Text textCentre;

    @Override
    public void start(Stage primaryStage) {

        this.controller = new MenuController(this);

        BorderPane root = new BorderPane();
        VBox topContainer = new VBox();
        MenuBar mainMenu = createMenus();

        topContainer.getChildren().add(mainMenu);

        root.setTop(topContainer);

        this.textCentre = new Text("Click a menu item");
        root.setCenter(textCentre);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Menu Sample");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() {
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * A control that represents a menu bar, which is a horizontal bar containing menus.
     * It can be used to create a menu-based navigation system in a graphical user interface.
     */
    private MenuBar createMenus() {
        MenuBar menuBar = new MenuBar();

        Menu menuFile = new Menu("File");

        MenuItem openFile = new MenuItem("Open");
        openFile.setOnAction(event -> this.controller.doFileOpen());

        MenuItem printFile = new MenuItem("Print");
        printFile.setOnAction(event -> this.controller.doFilePrint());

        MenuItem exitApp = new MenuItem("Exit");
        exitApp.setOnAction(event -> this.controller.doFileExit());

        menuFile.getItems().addAll(openFile, printFile);
        menuFile.getItems().add(new SeparatorMenuItem());
        menuFile.getItems().add(exitApp);

        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");

        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);

        return menuBar;
    }

    public void displayMessage(String message) {
        this.textCentre.setText(message);
    }
}
