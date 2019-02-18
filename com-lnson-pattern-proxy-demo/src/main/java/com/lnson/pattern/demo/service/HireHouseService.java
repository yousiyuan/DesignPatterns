package com.lnson.pattern.demo.service;

/**
 * 抽象房东的一系列行为
 */
public interface HireHouseService {

    /**
     * 租房子
     */
    public abstract String hire(String[] houseList);

}
