package com.aaa.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author:尹跃朝
 * @Description:
 * @Date:2019/12/3
 */
@Data
public class BookInfo implements Serializable {
    private Long bookId;
    private String bookName;
    private Integer bookStore;
    private BigDecimal bookPrice;
}
