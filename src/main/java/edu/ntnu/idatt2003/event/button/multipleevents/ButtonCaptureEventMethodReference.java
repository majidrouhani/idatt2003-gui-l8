/* Online help: https://openjfx.io/openjfx-docs/#maven
 * Non-modular from IDE
 * Run argument: --module-path "C:\git\javafx\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml
 */

package edu.ntnu.idatt2003.event.button.multipleevents;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ButtonCaptureEventMethodReference extends Application {
  static final String EVENT_TYPE_STR = "Event type: ";
  private static final Logger LOGGER = Logger.getLogger(ButtonCaptureEventMethodReference.class.getName());

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("My first stage with scene");
    Button btn = new Button();
    btn.setText("Say 'Hello World'");

    btn.setOnMouseClicked(this::logEventType);
    btn.setOnMouseReleased(this::logEventType);
    btn.setOnScroll(this::logEventType);

    StackPane root = new StackPane();
    root.getChildren().add(btn);

    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }
 private void logEventType(Event e) {
    String message = String.format("%s, %s, %s", EVENT_TYPE_STR, e.getEventType(), e.getTarget());
    LOGGER.log(Level.INFO, message);
  }    
}