package com.han.atm.batter.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TB_BATTER")
public class Batter {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BATTER_ID")
    private int batterId;
    
    @Column(name = "BATTER_GROUP_ID")
    private int batterGroupId;
    
    @Column(name = "BATTER_NAME")
    private String batterName;
    
    @Column(name = "ORDER_POSITION_CD")
    private String orderPositionCd;
    
    @Column(name = "FIRST_BATTING_PRICE")
    private BigDecimal firstBattingPrice;
    
    @Column(name = "TAKE_PROFIT_RATE")
    private BigDecimal takeProfitRate;
    
    @Column(name = "STOP_LOSS_RATE")
    private BigDecimal stopLossRate;
    
    @Column(name = "RETRY_INCREMENT_PRICE_RATE")
    private BigDecimal retryIncrementPriceRate;
    
    @Column(name = "CREATED_DTTM")
    private Timestamp createdDttm;
    
    @Column(name = "MODIFIED_DTTM")
    private Timestamp modifiedDttm;

}
