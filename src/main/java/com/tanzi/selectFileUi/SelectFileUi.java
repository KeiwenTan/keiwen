package com.tanzi.selectFileUi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectFileUi extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SelectFileUi.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("选择文件");
        primaryStage.setScene(new Scene(root, 451, 230));
        primaryStage.show();
    }
}
