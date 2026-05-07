package com.food.ordering.system.outbox;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OutboxStatus {

    STARTED("记录已创建，等待发布"),
    COMPLETED("消息已成功发布"),
    FAILED("消息发布失败");

    private final String desc;
}