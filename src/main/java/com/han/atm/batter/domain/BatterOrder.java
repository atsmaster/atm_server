package com.han.atm.batter.domain;

import com.han.atm.common.domain.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "BATTER_ORDER")
public class BatterOrder extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "ORDER_SYMBOL")
    private String orderSymbol;

    @Column(name = "ORDER_POSITION_CODE")
    private String orderPositionCode;

    @Column(name = "ORDER_TYPE_CODE")
    private String orderTypeCode;

    @Column(name = "ORDER_DT")
    private Timestamp orderDt;

    @Column(name = "ORDER_PRICE")
    private BigDecimal orderPrice;

    @Column(name = "ORDER_QUANTITY")
    private BigDecimal orderQuantity;

    @Column(name = "ORDER_STATUS_CODE")
    private String orderStatusCode;

    @Column(name = "TRANSACTION_DT")
    private Timestamp transactionDt;

    @Column(name = "TRANSACTION_PRICE")
    private BigDecimal transactionPrice;

    @Column(name = "TRANSACTION_QUANTITY")
    private BigDecimal transactionQuantity;

    @Column(name = "TRANSACTION_TOTAL_AMOUNT")
    private BigDecimal transactionTotalAmount;

    @Column(name = "COMMISSION")
    private BigDecimal commission;

    @Column(name = "BATTER_EXECUTION_ID")
    private String batterExecutionId;

}
