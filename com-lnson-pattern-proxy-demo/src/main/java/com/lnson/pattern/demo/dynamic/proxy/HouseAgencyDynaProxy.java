package com.lnson.pattern.demo.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK的动态代理
 * 代理对象必须实现接口 InvocationHandler
 *
 * 代理对象：中介公司
 * 被代理对象：房东
 */
public class HouseAgencyDynaProxy implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private Object obj;

    public HouseAgencyDynaProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * @param proxy  代理对象
     * @param method 被代理的对象所实现的接口方法
     * @param args   被代理的对象所实现的接口方法的参数列表
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置工作 ===>> 开始");
        if (args != null) {
            System.out.print("中介收到房源：");
            for (String arg : (String[])args[0]) {
                System.out.print(arg);
                System.out.print("；");
            }
        }
        System.out.println("\r\n前置工作 ===>> 结束");

        Object result = method.invoke(this.obj, args);

        System.out.println("\r\n后置工作 ===>> 结束");
        System.out.println("中介代理房东租房子：" + result);
        System.out.println("后置工作 ===>> 结束\r\n");

        return result + " 正在出租中...";
    }

}
