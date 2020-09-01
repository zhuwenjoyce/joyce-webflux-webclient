package com.joyce.webclient.demo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class MoneyHistoryModel {

    private Integer moneyId;
    private Integer userId;
    private BigDecimal money;
    private ZonedDateTime createTime;

}
