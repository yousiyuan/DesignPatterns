package com.lnson.pattern.singleton.demo;

import com.lnson.pattern.singleton.demo.utils.TxtFileUtils;

import java.io.IOException;

/**
 * 单例模式-类级内部类方式实现
 * 场景：计数器的设计（推荐使用这种设计方式）
 */
public class NewCounter {

    /**
     * 构造器不可访问
     */
    private NewCounter() {
    }

    /**
     * 获取唯一实例
     */
    public static NewCounter getInstance() {
        return NewCounterBuilder.counter;
    }

    public static class NewCounterBuilder {
        private static NewCounter counter = new NewCounter();
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
        String text = TxtFileUtils.read(this.getClass().getClassLoader().getResource("static/newCounter.txt").getPath());
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

        TxtFileUtils.write(String.valueOf(invokeNums), this.getClass().getClassLoader().getResource("static/newCounter.txt").getPath());
    }

}
