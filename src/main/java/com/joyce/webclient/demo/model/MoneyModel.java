package com.joyce.webclient.demo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Data
public class MoneyModel {

    private Integer moneyId;
    private Integer userId;
    private BigDecimal money;
    private String remark;
    private ZonedDateTime createTime;
    private List<MoneyHistoryModel> moneyHistoryModelList;

}
