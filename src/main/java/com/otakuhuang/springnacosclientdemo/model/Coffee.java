package com.otakuhuang.springnacosclientdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import java.io.Serializable;
import java.util.Date;

/**
 * @author otaku
 * @version 1.0
 * @date 2022/2/28 0:35
 * @description description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coffee implements Serializable {
    private Long id;
    private String name;
    private Money price;
    private Date createTime;
    private Date updateTime;
}
