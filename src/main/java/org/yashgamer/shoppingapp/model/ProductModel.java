package org.yashgamer.shoppingapp.model;

import org.yashgamer.shoppingapp.enums.DeliveryType;

public record ProductModel(
        String imageUrl,
        String name,
        String price,
        DeliveryType deliveryType,
        String deliveryTime
) { }
