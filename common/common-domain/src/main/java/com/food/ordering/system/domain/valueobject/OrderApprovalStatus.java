package com.food.ordering.system.domain.valueobject;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrderApprovalStatus {
    APPROVED("批准"),
    REJECTED("拒绝"),
    ;
    @Getter(AccessLevel.PRIVATE)
    private final String desc;
}
