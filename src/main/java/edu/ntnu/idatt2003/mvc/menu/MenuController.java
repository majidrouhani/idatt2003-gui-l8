package edu.ntnu.idatt2003.mvc.menu;

/**
 * Represents the Controller-role of the Model-View-Controller pattern.
 * All "actions" to be performed by the business logic of the application is
 * implemented here (or the "facade" to the business logic).
 */
public class MenuController {

  private MenuExample view;

  /**
   * Creates an instance of the MenuController class.
   * The controller needs to be told which view-object is relates
   * to, so that it can controll the GUI-components
   * of the view.
   *
   * @param view the view-object (JavaFX GUI pane or Application)
   */
  public MenuController(MenuExample view) {
    this.view = view;
  }

  /**
   * File open action. Called when the user has chosen
   * to open a file either by pressing a button, selecting a
   * menu or otherwise triggered a file open action from the GUI.
   */
  public void doFileOpen()
  {
    this.view.displayMessage("You clicked File->Open");
  }

  /**
   * File print action. Called when the user has chosen
   * to print a file either by pressing a button, selecting a
   * menu or otherwise triggered a print file action from the GUI.
   */
  public void doFilePrint()
  {
    this.view.displayMessage("You clicked File->Print");
  }

  /**
   * Exit application action. Called when the user has chosen
   * to exit the application either by pressing a button, selecting a
   * menu or otherwise triggered an exit application action from the GUI.
   */
  public void doFileExit()
  {
    this.view.displayMessage("You clicked File->Exit");
  }
}
