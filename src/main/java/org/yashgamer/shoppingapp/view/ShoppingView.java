package org.yashgamer.shoppingapp.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import org.yashgamer.shoppingapp.data.ProductData;

import java.io.IOException;

public class ShoppingView extends VBox {

    @FXML
    private VBox productContainer;

    public ShoppingView(){
        var fxmlLoader = new FXMLLoader(getClass().getResource("/org/yashgamer/shoppingapp/shopping-view.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try{
            fxmlLoader.load();
        } catch (IOException e) {
            System.out.println("Failed to load Shopping-View");
            e.printStackTrace();
        }
    }

    @FXML
    private void initialize(){
        var productModels = ProductData.getProductData();
        productModels.forEach(productModel -> {
            var productView = new ProductView(productModel);
            productContainer.getChildren().add(productView);
        });
    }

}
