package com.han.atm.batter.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TB_BATTER_GROUP_EXECUTION")
public class BatterGroupExecution {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BATTER_GROUP_EXECUTION_ID")
    private int batterGroupExecutionId;
    
    @Column(name = "BATTER_GROUP_ID")
    private int batterGroupId;
    
    @Column(name = "EXECUTION_YN")
    private String executionYn;
    
    @Column(name = "CREATED_DTTM")
    private Timestamp createdDttm;
    
    @Column(name = "MODIFIED_DTTM")
    private Timestamp modifiedDttm;

    public int getBatterGroupExecutionId() {
        return batterGroupExecutionId;
    }

    public void setBatterGroupExecutionId(int batterGroupExecutionId) {
        this.batterGroupExecutionId = batterGroupExecutionId;
    }

    public int getBatterGroupId() {
        return batterGroupId;
    }

    public void setBatterGroupId(int batterGroupId) {
        this.batterGroupId = batterGroupId;
    }

    public String getExecutionYn() {
        return executionYn;
    }

    public void setExecutionYn(String executionYn) {
        this.executionYn = executionYn;
    }

    public Timestamp getCreatedDttm() {
        return createdDttm;
    }

    public void setCreatedDttm(Timestamp createdDttm) {
        this.createdDttm = createdDttm;
    }

    public Timestamp getModifiedDttm() {
        return modifiedDttm;
    }

    public void setModifiedDttm(Timestamp modifiedDttm) {
        this.modifiedDttm = modifiedDttm;
    }

}
