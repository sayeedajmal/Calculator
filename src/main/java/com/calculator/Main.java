package com.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Calculator");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Calculator.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/fxml/Style.css");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
