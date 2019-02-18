package com.lnson.pattern.singleton.demo;

import com.lnson.pattern.singleton.demo.utils.TxtFileUtils;

import java.io.IOException;

/**
 * 单例模式-饿汉
 * 场景：计数器的设计
 */
public class Counter2 {

    private static Counter2 counter = new Counter2();

    private Counter2() {
    }

    public static Counter2 getInstance() {
        return counter;
    }

    /**
     * 计数
     */
    private static Integer invokeNums;

    /**
     * 获取计数
     */
    public int getInvokeNums() throws IOException {
        if (invokeNums != null)
            return invokeNums;

        //从配置文件读取
        String text = TxtFileUtils.read(this.getClass().getClassLoader().getResource("static/counter2.txt").getPath());
        invokeNums = Integer.valueOf(text);

        return invokeNums;
    }

    /**
     * 设置计数
     */
    public void setInvokeNums() throws IOException {
        if (invokeNums == null)
            invokeNums = getInstance().getInvokeNums();

        invokeNums += 1;
    }

    /**
     * 写入计数
     */
    public void writeCounter() throws IOException {
        if (invokeNums == null)
            invokeNums = getInstance().getInvokeNums();

        TxtFileUtils.write(String.valueOf(invokeNums), this.getClass().getClassLoader().getResource("static/counter2.txt").getPath());
    }

}
