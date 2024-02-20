/* Online help: https://openjfx.io/openjfx-docs/#maven
 * Non-modular from IDE
 * Run argument: --module-path "C:\git\javafx\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml
 */

package edu.ntnu.idatt2003.event.button.actionevent.ex3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleExampleButtonActionEvent1 extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("My first stage with scene");
    Button btn = new Button();
    btn.setText("Say 'Hello World'");
    btn.setId("btn1");

        
    btn.setOnAction((event) -> System.out.println("Event type: (lambda) " + event.getEventType()+", "+event.getTarget()));

    StackPane root = new StackPane();
    root.getChildren().add(btn);

    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }
}