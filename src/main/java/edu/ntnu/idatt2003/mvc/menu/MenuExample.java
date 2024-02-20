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
 * Demonstrates the use of menus in JavaFX, and 
 * how to handle events from the menu items.
 *
 * In this example, we demonstrate 3 different methods of event-handling:
 * <ol>
 *   <li>Using a <b>private inner class</b> (file open)</li>
 *   <li>Using a <b>private inner anonymous class</b> (file print)</li>
 *   <li>Using lambda-expressions (exit)</li>
 * </ol>
 *
 * We have skipped demonstrating the use of <b>centralized event handling</b>,
 * i.e. letting the MenuSample-class implement the EventHandler<ActionEvent> interface,
 * since centralized event handling is usually not very useful.
 */
public class MenuExample extends Application
{
    // While the MenuSample-class plays the role of the View in the
    // MVC-pattern, the view must have a controller to work with,
    // containing the code to be executed upon an action event.
    private MenuController controller ;

    // Place the textCentre variable as a field so that it can be reached
    // from all the methods in the class.
    private Text textCentre;

    /**
     * The start-method is called by the JavaFX platform upon starting the
     * JavaFX-platform. The method is abstract and must be overridden by
     * any subclass of Application.
     * The main window is setup in this method, including menus, toolboxes etc.
     *
     * @param primaryStage The main stage making up the main window.
     */
    @Override
    public void start(Stage primaryStage)
    {
        // Create the controller and let "myself" be the view that the
        // controller is to collaborate with.
        this.controller = new MenuController(this);

        // Creat the GUI content.
        BorderPane root = new BorderPane(); // Create the root node. The Menu will be placed at the top
        VBox topContainer = new VBox();  //Creates a container to hold all Menu Objects.
        MenuBar mainMenu = createMenus();  //Creates our main menu to hold our Sub-Menus.

        // Place the menubar in the topContainer
        topContainer.getChildren().add(mainMenu);

        // Place the top container in the top-section of the BorderPane
        root.setTop(topContainer);

        // Add a Text-component in the centre
        this.textCentre = new Text("Click a menu item");
        root.setCenter(textCentre);

        // Create the scene, adding the rootNode and setting the size
        Scene scene = new Scene(root, 300, 250);
        // Set title of the stage (window) and add the scene
        primaryStage.setTitle("Menu Sample");
        primaryStage.setScene(scene);
        // Finally, make the stage (window) visible
        primaryStage.show();
    }

    /**
     * The stop() method is being called by the JavaFX-platform when the
     * platform stops, are being terminated. This would typically happen
     * as a result of the last open window being closed.
     * Override this method to make sure that the application is terminated.
     */
    @Override
    public void stop()
    {
        System.exit(0);
    }

    /**
     * The entry-point to start the application.
     * In addition, a separate non-JavaFX class has been set up
     * that also contains the main()-method. That should be the
     * actual starting point, and is required if creating an
     * executable JAR.
     *
     * @param args Command-line arguments supplied during startup
     */
    public static void main(String[] args)
    {
        launch(args);
    }

    /**
     * Creates and returns the menus to be displayed.
     * Notice how anonomous classes are being used to add
     * event listeners/handlers to the menu items.
     * Also note how we delegate the handling/processing
     * of the events to separate methods like <code>doFileOpen()</code>
     * and <code>doFilePrint()</code>.
     * 
     * @return The MenuBar to be displayed.
     */
    private MenuBar createMenus()
    {
        // Create the Menu Bar to hold all the menus
        MenuBar menuBar = new MenuBar();

        // The File-menu
        Menu menuFile = new Menu("File");

        // ------------------ Open File using private inner class for event handling ------
        MenuItem openFile = new MenuItem("Open");
        openFile.setOnAction( event -> this.controller.doFileOpen());

        // ------------------ Print File using private inner anonymous class for event handling ----
        MenuItem printFile = new MenuItem("Print");
        printFile.setOnAction(event -> this.controller.doFilePrint());

        // ------------------ Exit application using Lambda for event handling ------
        MenuItem exitApp = new MenuItem("Exit");
        exitApp.setOnAction( event -> this.controller.doFileExit() );
                    
        menuFile.getItems().addAll(openFile, printFile);
        menuFile.getItems().add(new SeparatorMenuItem());
        menuFile.getItems().add(exitApp);

        // The Edit-menu
        Menu menuEdit = new Menu("Edit");
        // The View-menu
        Menu menuView = new Menu("View");

        // Add all the menues to the menubar
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);

        return menuBar;
    }

    /**
     * Shows the message provided by the parameter in the text field
     * in the centre of the GUI.
     *
     * @param message the message to be displayed
     */
    public void displayMessage(String message) {
        this.textCentre.setText(message);
    }
}
