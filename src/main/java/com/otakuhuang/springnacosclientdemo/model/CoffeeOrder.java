package com.otakuhuang.springnacosclientdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author otaku
 * @version 1.0
 * @date 2022/2/28 0:36
 * @description description
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeOrder implements Serializable {
    private Long id;
    private String customer;
    private List<Coffee> items;
    private OrderState state;
    private Date createTime;
    private Date updateTime;
}
