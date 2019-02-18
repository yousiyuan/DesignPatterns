package com.lnson.pattern.singleton.demo.test;

import com.lnson.pattern.singleton.demo.NewCounter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class NewCounterTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws IOException {
        //写入计数
        NewCounter.getInstance().writeCounter();
    }

    /**
     * 读取计数
     */
    @Test
    public void test1() throws IOException {
        System.out.println(NewCounter.getInstance().getInvokeNums());
    }

    /**
     * 设置计数
     */
    @Test
    public void test2() throws IOException {
        NewCounter counter = NewCounter.getInstance();
        for (int i = 0; i < 100; i++)
            counter.setInvokeNums();
    }

}
