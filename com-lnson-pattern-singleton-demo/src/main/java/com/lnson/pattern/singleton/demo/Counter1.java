package com.lnson.pattern.singleton.demo;

import com.lnson.pattern.singleton.demo.utils.TxtFileUtils;

import java.io.IOException;

/**
 * 单例模式-懒汉
 * 场景：计数器的设计
 */
public class Counter1 {

    private static Counter1 counter = null;

    /**
     * 构造器不可访问
     */
    private Counter1() {
        System.out.println("Counter1 was created!");
    }

    /**
     * 获取唯一实例
     */
    public static Counter1 getInstance() {
        if (counter == null)
            synchronized (Counter1.class) {
                if (counter == null)
                    counter = new Counter1();
            }
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
        String text = TxtFileUtils.read(this.getClass().getClassLoader().getResource("static/counter1.txt").getPath());
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

        TxtFileUtils.write(String.valueOf(invokeNums), this.getClass().getClassLoader().getResource("static/counter1.txt").getPath());
    }

}
