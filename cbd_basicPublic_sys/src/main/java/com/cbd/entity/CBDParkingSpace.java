package com.cbd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * CBD车位
 *
 * @author liren
 * @date 2020-05-11
 */
@Data
public class CBDParkingSpace implements Serializable {

    /** CBD车位ID */
    private Integer id;

    /** CBD车位编号 */
    private String serialNumber;

    /** 车位地址 */
    private String address;

    /** 最长可租日期 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date maxRentTime;

    /** 外部合约 */
    private ExternalContract externalContract;

    /** CBD车位交易信息集合 */
    private List<CBDParkingSpaceDealing> cbdParkingSpaceDealingList;
}
