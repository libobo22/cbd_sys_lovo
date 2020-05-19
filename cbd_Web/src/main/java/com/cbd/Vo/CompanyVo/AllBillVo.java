package com.cbd.Vo.CompanyVo;

import lombok.Data;

/**
 * 合计账单
 */
@Data
public class AllBillVo {
    /**交易总笔数*/
    private String nums;

    /**支出金额*/
    private String expendAll;

    /**收入金额*/
    private String incomeAll;

    public AllBillVo() {
    }

    public AllBillVo(String nums, String expendAll, String incomeAll) {
        this.nums = nums;
        this.expendAll = expendAll;
        this.incomeAll = incomeAll;
    }
}
