package com.lnson.pattern.decorator.demo.test;

import com.lnson.pattern.decorator.demo.Decorator;
import com.lnson.pattern.decorator.demo.DecoratorExtension;
import com.lnson.pattern.demo.service.impl.XlsExcelWrite;
import com.lnson.pattern.demo.service.impl.XlsxExcelWrite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 测试装饰器
 */
public class DecoratorTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test1() {
        Decorator decorator1 = new Decorator();
        decorator1.setExcelWrite(new XlsExcelWrite());
        decorator1.write();

        System.out.println("---------------------------------");

        Decorator decorator2 = new Decorator();
        decorator2.setExcelWrite(new XlsxExcelWrite());
        decorator2.write();
    }

    @Test
    public void test2() {
        Decorator decorator1 = new DecoratorExtension();
        decorator1.setExcelWrite(new XlsExcelWrite());
        decorator1.write();

        System.out.println("---------------------------------");

        Decorator decorator2 = new DecoratorExtension();
        decorator2.setExcelWrite(new XlsxExcelWrite());
        decorator2.write();
    }

}
