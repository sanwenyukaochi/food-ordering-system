package com.food.ordering.system.domain.valueobject;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum RestaurantOrderStatus {
    PAID("已支付"),
    ;
    @Getter(AccessLevel.PRIVATE)
    private final String desc;
}