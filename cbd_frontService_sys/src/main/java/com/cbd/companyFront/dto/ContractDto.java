package com.cbd.companyFront.dto;
import lombok.Data;

import java.util.Date;

/**
 * 企业---我的合同实体类
 */
@Data//此注解表示自动set/get
public class ContractDto {

    /**租赁合同ID*/
    private int contactnoID;

    /**公司ID*/
    private int companyID;

    /**合同编号*/
    private String contactno;

    /**合同开始日期*/
    private Date contractStrat;

    /**合同结束日期*/
    private Date contractEnd;

    /**合同复印件*/
    private String copyOfContract;

    /**成交价格*/
    private double price;

    /**合同状态*/
    private int contactnoStatus;


    public ContractDto() {
    }

    public ContractDto(int contactnoID, int companyID, String contactno, Date contractStrat,
                       Date contractEnd, String copyOfContract, double price, int contactnoStatus) {
        this.contactnoID = contactnoID;
        this.companyID = companyID;
        this.contactno = contactno;
        this.contractStrat = contractStrat;
        this.contractEnd = contractEnd;
        this.copyOfContract = copyOfContract;
        this.price = price;
        this.contactnoStatus = contactnoStatus;
    }
}
