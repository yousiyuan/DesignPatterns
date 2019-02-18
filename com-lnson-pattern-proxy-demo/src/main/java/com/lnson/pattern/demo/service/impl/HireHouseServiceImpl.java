package com.lnson.pattern.demo.service.impl;

import com.lnson.pattern.demo.service.HireHouseService;

/**
 * 房东
 */
public class HireHouseServiceImpl implements HireHouseService {

    /**
     * 租房子
     */
    @Override
    public String hire(String[] houseList) {
        String strHouse = String.join(",", houseList);
        return strHouse;
    }

}
