package com.han.atm.batter.domain;

import com.han.atm.common.domain.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_BATTER_EXECUTION")
public class BatterExecution extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BATTER_EXECUTION_ID")
    private String batterExecutionId;

    @Column(name = "BATTER_GROUP_EXECUTION_ID")
    private String batterGroupExecutionId;

    @Column(name = "BATTING_SYMBOL")
    private String battingSymbol;

    @Column(name = "BATTING_STATUS_CODE")
    private String battingStatusCode;

    @Column(name = "BATTING_AMOUNT")
    private BigDecimal battingAmount;

    @Column(name = "TOTAL_PROFIT_AMOUNT")
    private BigDecimal totalProfitAmount;

    @Column(name = "EXCEPT_LOSS_AMOUNT")
    private BigDecimal exceptLossAmount;

    @Column(name = "TOTAL_PROFIT_COUNT")
    private Integer totalProfitCount;

    @Column(name = "TOTAL_LOSS_COUNT")
    private Integer totalLossCount;

    @Column(name = "LOSS_COUNT")
    private Integer lossCount;

    @Column(name = "PROFIT_CLOSE_REQUEST_YN")
    private String profitCloseRequestYn;
}
