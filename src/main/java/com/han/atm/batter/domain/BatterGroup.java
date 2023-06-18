package com.han.atm.batter.domain;

import com.han.atm.common.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@Table(name = "BATTER_GROUP")
public class BatterGroup extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BATTER_GROUP_ID")
    private String batterGroupId;
    @Column(name = "BATTER_GROUP_NAME")
    private String batterGroupName;
    @Column(name = "BATTER_COUNT")
    private Byte batterCount;
    @Column(name = "FIRST_BATTING_PRICE")
    private BigDecimal firstBattingPrice;
    @Column(name = "TAKE_PROFIT_RATE")
    private BigDecimal takeProfitRate;
    @Column(name = "STOP_LOSS_RATE")
    private BigDecimal stopLossRate;
    @Column(name = "RETRY_INCREMENT_PRICE_RATE")
    private BigDecimal retryIncrementPriceRate;
    @Column(name = "TOTAL_FUNDS")
    private BigDecimal totalFunds;

}
