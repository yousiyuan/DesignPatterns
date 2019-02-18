package com.lnson.pattern.singleton.demo.test;

import com.lnson.pattern.singleton.demo.Counter1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Counter1Test {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws IOException {
        //写入计数
        Counter1.getInstance().writeCounter();
    }

    /**
     * 读取计数
     */
    @Test
    public void test1() throws IOException {
        System.out.println(Counter1.getInstance().getInvokeNums());
    }

    /**
     * 设置计数
     */
    @Test
    public void test2() throws IOException {
        Counter1 counter = Counter1.getInstance();
        for (int i = 0; i < 100; i++)
            counter.setInvokeNums();
    }

}
