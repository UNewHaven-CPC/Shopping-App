package org.yashgamer.shoppingapp.data;

import org.yashgamer.shoppingapp.enums.DeliveryType;
import org.yashgamer.shoppingapp.model.ProductModel;

import java.util.List;

public class ProductData {

    public static List<ProductModel> getProductData(){
        return List.of(
                new ProductModel(
                        "https://i.pcmag.com/imagery/articles/03UZT3ATNI7D403fy8D6Z2W-1.fit_lim.size_500x.png",
                        "GIGABYTE Radeon RX 9070 XT",
                        "$799",
                        DeliveryType.FREE_DELIVERY_TONIGHT,
                        "Overnight delivery by 10 p.m"
                ),
                new ProductModel(
                        "https://w7.pngwing.com/pngs/273/555/png-transparent-computer-mouse-optical-mouse-sensor-mousepad-microsoft-surface-logitech-gaming-mouse-game-computer-video-game.png",
                        "Logitech Gaming Mouse",
                        "$79",
                        DeliveryType.PAID_DELIVERY,
                        "Tomorrow 10 p.m"
                ),
                new ProductModel(
                        "https://m.media-amazon.com/images/I/71duCIUwKML._AC_UF350,350_QL80_.jpg",
                        "Coffee Machine",
                        "$259",
                        DeliveryType.FREE_DELIVERY_TONIGHT,
                        "Overnight delivery by 1 a.m"
                ),
                new ProductModel(
                        "https://png.pngtree.com/png-vector/20241211/ourmid/pngtree-vibrant-rgb-keyboard-design-png-image_14699987.png",
                        "Gaming Keyboard",
                        "$102",
                        DeliveryType.FREE_DELIVERY,
                        "Tomorrow 7 p.m"
                )
        );
    }
}
