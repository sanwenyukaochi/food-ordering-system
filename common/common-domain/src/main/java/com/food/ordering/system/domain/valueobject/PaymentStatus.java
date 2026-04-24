package com.food.ordering.system.domain.valueobject;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PaymentStatus {
    COMPLETED("已完成"),
    CANCELLED("已取消"),
    FAILED("失败"),
    ;
    @Getter(AccessLevel.PRIVATE)
    private final String desc;
}
