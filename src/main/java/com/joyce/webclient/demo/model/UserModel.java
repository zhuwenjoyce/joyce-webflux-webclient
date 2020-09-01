package com.joyce.webclient.demo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class UserModel {

    private Integer userId;
    private String username;
    private MoneyModel moneyModel;
    private ZonedDateTime createTime;

}
