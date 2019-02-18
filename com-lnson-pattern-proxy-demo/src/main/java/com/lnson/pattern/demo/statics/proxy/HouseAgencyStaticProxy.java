package com.lnson.pattern.demo.statics.proxy;

import com.lnson.pattern.demo.service.HireHouseService;

/**
 * JDK的静态代理
 *
 * 代理对象：中介公司
 * 被代理对象：房东
 */
public class HouseAgencyStaticProxy implements HireHouseService {

    /**
     * 被代理的对象
     */
    private HireHouseService hireHouseService;

    public HouseAgencyStaticProxy(HireHouseService hireHouseService) {
        this.hireHouseService = hireHouseService;
    }

    @Override
    public String hire(String[] houseList) {
        System.out.println("前置工作 ===>> 开始");
        System.out.println("中介收到房源：" + String.join(",", houseList));
        System.out.println("前置工作 ===>> 结束");

        String result = hireHouseService.hire(houseList);

        System.out.println("\r\n后置工作 ===>> 结束");
        System.out.println("中介代理房东租房子：" + result);
        System.out.println("后置工作 ===>> 结束\r\n");

        return result + "正在出租中...";
    }

}
