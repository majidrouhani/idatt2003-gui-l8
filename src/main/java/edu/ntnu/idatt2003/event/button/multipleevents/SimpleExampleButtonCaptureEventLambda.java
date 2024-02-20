/* Online help: https://openjfx.io/openjfx-docs/#maven
 * Non-modular from IDE
 * Run argument: --module-path "C:\git\javafx\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml
 */

package edu.ntnu.idatt2003.event.button.multipleevents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleExampleButtonCaptureEventLambda extends Application {
  static final String EVENT_TYPE_STR = "Event type: ";

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("My first stage with scene");
    Button btn = new Button();
    btn.setText("Say 'Hello World'");

    btn.setOnMouseClicked((MouseEvent e) -> System.out.println(
        EVENT_TYPE_STR + e.getEventType() + ", " + e.getButton()));
    btn.setOnMouseReleased((MouseEvent e) -> System.out.println(
        EVENT_TYPE_STR + e.getEventType() + ", " + e.getButton()));
    btn.setOnScroll((ScrollEvent e) -> System.out.println(
        EVENT_TYPE_STR + e.getEventType() + ", " + e.getDeltaY()));

    StackPane root = new StackPane();
    root.getChildren().add(btn);

    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }
}