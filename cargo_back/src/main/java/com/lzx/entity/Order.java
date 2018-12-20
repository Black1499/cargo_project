package com.lzx.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String orderId;

    private Integer orderRelUser;

    private Integer orderRecUser;

    private Integer orderCarTypeId;

    private Date orderCreated;

    private Date orderTaked;

    private Date orderFinished;

    private String orderDescribe;

    private BigDecimal orderMoney;

    private String orderStartPlace;

    private String orderEndPlace;

    private String orderState;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
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

    public Date getOrderTaked() {
        return orderTaked;
    }

    public void setOrderTaked(Date orderTaked) {
        this.orderTaked = orderTaked;
    }

    public Date getOrderFinished() {
        return orderFinished;
    }

    public void setOrderFinished(Date orderFinished) {
        this.orderFinished = orderFinished;
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

    public Order() {
    }

    public Order(String orderId, String orderState) {
        this.orderId = orderId;
        this.orderState = orderState;
    }

    public Order(String orderId, Integer orderRelUser, Integer orderRecUser, Integer orderCarTypeId, String orderDescribe, BigDecimal orderMoney, String orderStartPlace, String orderEndPlace) {
        this.orderId = orderId;
        this.orderRelUser = orderRelUser;
        this.orderRecUser = orderRecUser;
        this.orderCarTypeId = orderCarTypeId;
        this.orderDescribe = orderDescribe;
        this.orderMoney = orderMoney;
        this.orderStartPlace = orderStartPlace;
        this.orderEndPlace = orderEndPlace;
    }
}