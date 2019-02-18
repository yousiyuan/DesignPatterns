package com.lnson.pattern.demo.dynamic.proxy.test;

import com.lnson.pattern.demo.dynamic.proxy.HouseAgencyDynaProxy;
import com.lnson.pattern.demo.service.HireHouseService;
import com.lnson.pattern.demo.service.impl.HireHouseServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 */
public class HouseAgencyDynaProxyTest1 {

    /**
     * 被代理的对象
     */
    private HireHouseService hireHouseService;

    @Before
    public void setUp() {
        hireHouseService = new HireHouseServiceImpl();
    }

    @After
    public void tearDown() {
    }

    /**
     * 创建代理对象
     */
    @Test
    public void test() {
        //代理对象
        HireHouseService proxyInstance = (HireHouseService) Proxy.newProxyInstance(
                hireHouseService.getClass().getClassLoader(),
                hireHouseService.getClass().getInterfaces(),//被代理的对象所实现的接口
                new HouseAgencyDynaProxy(hireHouseService)//代理对象
        );
        String result = proxyInstance.hire(new String[]{"房子1", "房子2", "房子3"});
        System.out.println(result);
    }

}
