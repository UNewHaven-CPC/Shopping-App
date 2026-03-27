package org.yashgamer.shoppingapp.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import org.yashgamer.shoppingapp.model.ProductModel;

import java.io.IOException;

public class ProductView extends HBox {

    private ProductModel productModel;

    @FXML
    private ImageView productImageView;
    @FXML
    private Label productName;
    @FXML
    private Label productPrice;
    @FXML
    private Label productDeliveryType;
    @FXML
    private Label productDeliveryTime;

    public ProductView(){
        var fxmlLoader = new FXMLLoader(getClass().getResource("/org/yashgamer/shoppingapp/product-view.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try{
            fxmlLoader.load();
        } catch (IOException e) {
            System.out.println("Failed to load Product-View");
            e.printStackTrace();
        }
    }

    public ProductView(ProductModel productModel){
        this.productModel = productModel;
        this();
    }

    @FXML
    private void initialize(){
        var image = new Image(productModel.imageUrl(), true);
        productImageView.setImage(image);
        productName.setText(productModel.name());
        productPrice.setText(productModel.price());
        productDeliveryType.setText(productModel.deliveryType().getDescription());
        productDeliveryTime.setText(productModel.deliveryTime());
    }
}
