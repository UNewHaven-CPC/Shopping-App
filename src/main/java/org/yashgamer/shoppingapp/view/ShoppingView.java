package org.yashgamer.shoppingapp.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ShoppingView extends VBox {

    public ShoppingView(){
        var fxmlLoader = new FXMLLoader(getClass().getResource("/org/yashgamer/shoppingapp/shopping-view.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try{
            fxmlLoader.load();
        } catch (IOException e) {
            System.out.println("Failed to load Shopping-View");
        }
    }

}
