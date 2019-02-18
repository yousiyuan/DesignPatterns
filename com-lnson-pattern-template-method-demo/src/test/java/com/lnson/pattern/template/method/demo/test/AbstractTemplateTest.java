package com.lnson.pattern.template.method.demo.test;

import com.lnson.pattern.template.method.demo.AbstractTemplate;
import com.lnson.pattern.template.method.demo.ConcreteTemplate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AbstractTemplateTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        AbstractTemplate absTemp = new ConcreteTemplate();
        absTemp.templateMethod();
    }

}
