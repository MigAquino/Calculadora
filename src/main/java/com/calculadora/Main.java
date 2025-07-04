package com.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());

            FileInputStream inputImage = new FileInputStream("src/main/java/com/calculadora/calculator.png");
            Image icon = new Image(inputImage);

            stage.getIcons().add(icon);
            stage.setTitle("Calculator");
            stage.setResizable(false);

            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}