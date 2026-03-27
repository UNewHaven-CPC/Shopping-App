package org.yashgamer.shoppingapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.yashgamer.shoppingapp.view.ShoppingView;

import java.io.IOException;

public class ShoppingApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var shoppingView = new ShoppingView();
        Scene scene = new Scene(shoppingView, 320, 240);
        stage.setTitle("Shopping Application");
        stage.getIcons().setAll(new Image(getClass().getResource("/org/yashgamer/shoppingapp/images/tom-fbi.png").openStream()));
        stage.setScene(scene);
        stage.show();
    }
}
