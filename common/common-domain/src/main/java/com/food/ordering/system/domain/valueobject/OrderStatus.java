package com.food.ordering.system.domain.valueobject;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrderStatus {
    PENDING("待支付"),
    PAID("已支付"),
    APPROVED("已确认"),
    CANCELLING("取消中"),
    CANCELLED("已取消"),
    ;
    @Getter(AccessLevel.PRIVATE)
    private final String desc;
}
