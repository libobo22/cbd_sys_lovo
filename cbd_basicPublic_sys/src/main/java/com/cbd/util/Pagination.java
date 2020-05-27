package com.cbd.util;

import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pagination<T> {

    /**
     * 当前页
     */
    private int currentPage;

    /**
     * 数据集
     */
    private List<T> data;

    /**
     * 总记录数
     */
    private int totalCount;
}
