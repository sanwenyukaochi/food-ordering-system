package com.food.ordering.system.saga;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum SagaStatus {
    STARTED("已开始"),
    PROCESSING("正在处理中"),
    SUCCEEDED("已成功完成"),
    FAILED("执行失败"),
    COMPENSATING("正在执行补偿"),
    COMPENSATED("已完成补偿");

    @Getter(AccessLevel.PRIVATE)
    private final String desc;
}