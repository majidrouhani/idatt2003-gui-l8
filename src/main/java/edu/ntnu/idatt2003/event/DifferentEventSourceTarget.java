package edu.ntnu.idatt2003.event;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DifferentEventSourceTarget extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click me");
        StackPane root = new StackPane(button);

        button.setOnAction(event -> {
            System.out.println("Button clicked");
            System.out.println("Original event source: " + event.getSource());
            System.out.println("Original event target: " + event.getTarget());

            // Create a new event with the StackPane as the source
            Event newEvent = new Event(root, button, event.getEventType());

            System.out.println("New event source: " + newEvent.getSource());
            System.out.println("New event target: " + newEvent.getTarget());

            // Dispatch the new event
            Event.fireEvent(root, newEvent);
        });

        root.setOnMouseClicked(event -> {
            System.out.println("StackPane clicked");
            System.out.println("Event source: " + event.getSource());
            System.out.println("Event target: " + event.getTarget());
        });

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}