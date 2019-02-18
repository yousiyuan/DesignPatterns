package com.lnson.pattern.demo.statics.proxy.test;

import com.lnson.pattern.demo.service.HireHouseService;
import com.lnson.pattern.demo.service.impl.HireHouseServiceImpl;
import com.lnson.pattern.demo.statics.proxy.HouseAgencyStaticProxy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 静态代理测试
 */
public class HouseAgencyStaticProxyTest {

    private HireHouseService hireHouseService;

    @Before
    public void setUp() {
        hireHouseService = new HireHouseServiceImpl();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        HouseAgencyStaticProxy proxyInstance = new HouseAgencyStaticProxy(hireHouseService);
        String result = proxyInstance.hire(new String[]{"房子4", "房子5", "房子6"});
        System.out.println(result);
    }

}
