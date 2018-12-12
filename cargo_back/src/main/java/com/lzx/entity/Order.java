package com.lzx.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer orderRelUser;

    private Integer orderRecUser;

    private Integer orderCarTypeId;

    private Date orderCreated;

    private String orderDescribe;

    private BigDecimal orderMoney;

    private String orderStartPlace;

    private String orderEndPlace;

    private String orderState;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderRelUser() {
        return orderRelUser;
    }

    public void setOrderRelUser(Integer orderRelUser) {
        this.orderRelUser = orderRelUser;
    }

    public Integer getOrderRecUser() {
        return orderRecUser;
    }

    public void setOrderRecUser(Integer orderRecUser) {
        this.orderRecUser = orderRecUser;
    }

    public Integer getOrderCarTypeId() {
        return orderCarTypeId;
    }

    public void setOrderCarTypeId(Integer orderCarTypeId) {
        this.orderCarTypeId = orderCarTypeId;
    }

    public Date getOrderCreated() {
        return orderCreated;
    }

    public void setOrderCreated(Date orderCreated) {
        this.orderCreated = orderCreated;
    }

    public String getOrderDescribe() {
        return orderDescribe;
    }

    public void setOrderDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe == null ? null : orderDescribe.trim();
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getOrderStartPlace() {
        return orderStartPlace;
    }

    public void setOrderStartPlace(String orderStartPlace) {
        this.orderStartPlace = orderStartPlace == null ? null : orderStartPlace.trim();
    }

    public String getOrderEndPlace() {
        return orderEndPlace;
    }

    public void setOrderEndPlace(String orderEndPlace) {
        this.orderEndPlace = orderEndPlace == null ? null : orderEndPlace.trim();
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }
}