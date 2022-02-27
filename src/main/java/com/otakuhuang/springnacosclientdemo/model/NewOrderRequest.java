package com.otakuhuang.springnacosclientdemo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author otaku
 * @version 1.0
 * @date 2022/2/28 0:38
 * @description description
 */
@Getter
@Setter
@Builder
public class NewOrderRequest {
    private String customer;
    private List<String> items;
}
