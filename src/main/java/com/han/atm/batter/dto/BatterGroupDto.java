package com.han.atm.batter.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class BatterGroupDto {
    private String batterGroupId;
    private String batterGroupName;
    private Byte batterCount;
    private BigDecimal firstBattingPrice;
    private BigDecimal takeProfitRate;
    private BigDecimal stopLossRate;
    private BigDecimal retryIncrementPriceRate;
    private BigDecimal totalFunds;
}
