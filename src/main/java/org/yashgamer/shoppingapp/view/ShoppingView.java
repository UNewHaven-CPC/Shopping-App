package org.yashgamer.shoppingapp.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import org.yashgamer.shoppingapp.enums.DeliveryType;
import org.yashgamer.shoppingapp.model.ProductModel;

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
        var productModel = new ProductModel(
                "https://i.pcmag.com/imagery/articles/03UZT3ATNI7D403fy8D6Z2W-1.fit_lim.size_500x.png",
                "GIGABYTE Radeon RX 9070 XT",
                "$799",
                DeliveryType.FREE_DELIVERY_TONIGHT,
                "Overnight delivery by 10 p.m"
        );
        var productModel2 = new ProductModel(
                "https://i.pcmag.com/imagery/articles/03UZT3ATNI7D403fy8D6Z2W-1.fit_lim.size_500x.png",
                "GIGABYTE Radeon RX 9070 XT",
                "$799",
                DeliveryType.FREE_DELIVERY_TONIGHT,
                "Overnight delivery by 10 p.m"
        );
        var productModel3 = new ProductModel(
                "https://i.pcmag.com/imagery/articles/03UZT3ATNI7D403fy8D6Z2W-1.fit_lim.size_500x.png",
                "GIGABYTE Radeon RX 9070 XT",
                "$799",
                DeliveryType.FREE_DELIVERY_TONIGHT,
                "Overnight delivery by 10 p.m"
        );
        ProductView productView1 = new ProductView(productModel);
        productContainer.getChildren().add(productView1);
    }

}
