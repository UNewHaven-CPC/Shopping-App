package org.yashgamer.shoppingapp.enums;

import lombok.Getter;

@Getter
public enum DeliveryType {
    FREE_DELIVERY("Free Delivery: "),
    FREE_DELIVERY_TONIGHT("Free Delivery Tonight: "),
    PAID_DELIVERY("Paid Delivery: ");

    private final String description;

    DeliveryType(String description){
        this.description = description;
    }
}
