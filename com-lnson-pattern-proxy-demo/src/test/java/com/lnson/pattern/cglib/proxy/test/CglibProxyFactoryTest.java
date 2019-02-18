package com.lnson.pattern.cglib.proxy.test;

import com.lnson.pattern.demo.cglib.proxy.CglibProxyFactory;
import com.lnson.pattern.demo.component.DateHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * CGLIB代理测试
 */
public class CglibProxyFactoryTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        DateHelper dateHelper = (DateHelper) new CglibProxyFactory(new DateHelper()).newProxyInstance();
        String result = dateHelper.formatDate(System.currentTimeMillis());
        System.out.println(result);
    }

}
