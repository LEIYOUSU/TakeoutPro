package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 购物车
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;   //名称
    private Long userId;    //用户id
    private Long dishId;    //菜品id
    private Long setmealId;    //套餐id
    private String dishFlavor;    //口味
    private Integer number;    //数量
    private BigDecimal amount;    //金额
    private String image;    //图片
    private LocalDateTime createTime;
}
