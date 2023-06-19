package com.han.atm.batter.domain;


import javax.persistence.*;

@Entity
@Table(name = "TB_COMM_CD")
@IdClass(CommCdId.class)
public class CommCd {
    @Id
    @Column(name = "COMM_CD_TYPE")
    private String commCdType;

    @Id
    @Column(name = "COMM_CD")
    private String commCd;

    @Basic
    @Column(name = "COMM_CD_NAME")
    private String commCdName;

}
