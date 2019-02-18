package com.lnson.pattern.abs.decorator.demo.test;

import com.lnson.pattern.abs.decorator.demo.DecoratorTemplate;
import com.lnson.pattern.abs.decorator.demo.ExcelDecorator;
import com.lnson.pattern.demo.service.impl.XlsExcelWrite;
import com.lnson.pattern.demo.service.impl.XlsxExcelWrite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DecoratorTemplateTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        DecoratorTemplate decorator1 = new ExcelDecorator();
        decorator1.setExcelWrite(new XlsExcelWrite());
        decorator1.write();

        System.out.println("-------------------------------------");

        DecoratorTemplate decorator2 = new ExcelDecorator();
        decorator2.setExcelWrite(new XlsxExcelWrite());
        decorator2.write();
    }

}
