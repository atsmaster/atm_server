package com.han.atm.batter.domain;

import com.han.atm.common.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "BATTER_GROUP_EXECUTION")
public class BatterGroupExecution extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BATTER_GROUP_EXECUTION_ID")
    private String batterGroupExecutionId;
    @Column(name = "BATTER_GROUP_ID")
    private String batterGroupId;
    @Column(name = "EXECUTION_YN")
    private String executionYn;

}
