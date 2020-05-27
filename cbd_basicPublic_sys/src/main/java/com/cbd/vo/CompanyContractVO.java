package com.cbd.vo;


import com.cbd.entity.CBDParkingSpace;
import com.cbd.entity.CompanyContract;
import lombok.Data;

import java.util.List;

@Data
public class CompanyContractVO {

    /** 合同 */
    private CompanyContract companyContract;

    /** CBD车位集合 */
    private List<CBDParkingSpace> cbdParkingSpaceList;
}
