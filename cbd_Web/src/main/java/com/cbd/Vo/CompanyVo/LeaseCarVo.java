package com.cbd.Vo.CompanyVo;
import lombok.Data;

/**
 * 企业---已租赁车位实体类
 */
@Data
public class LeaseCarVo {

    /**车位位置*/
    private String carPlace;

    /**车位号*/
    private String carNumber;

    /**合同编号*/
    private String contactno;

    /**合同开始日期*/
    private String contractStrat;

    /**合同结束日期*/
    private String contractEnd;


    public LeaseCarVo() {
    }

    public LeaseCarVo(String carPlace, String carNumber, String contactno,
                       String contractStrat, String contractEnd) {
        this.carPlace = carPlace;
        this.carNumber = carNumber;
        this.contactno = contactno;
        this.contractStrat = contractStrat;
        this.contractEnd = contractEnd;
    }
}
