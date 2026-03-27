package org.yashgamer.shoppingapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.yashgamer.shoppingapp.view.ShoppingView;

import java.io.IOException;

public class ShoppingApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var shoppingView = new ShoppingView();
        Scene scene = new Scene(shoppingView, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
