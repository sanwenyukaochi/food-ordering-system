package com.food.ordering.system.domain.valueobject;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PaymentOrderStatus {
    PENDING("待支付"),
    CANCELLED("已取消"),
    ;
    @Getter(AccessLevel.PRIVATE)
    private final String desc;
}
