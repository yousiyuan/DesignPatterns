package com.lnson.pattern.demo.dynamic.proxy.test;

import com.lnson.pattern.demo.service.HireHouseService;
import com.lnson.pattern.demo.service.impl.HireHouseServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 动态代理测试
 */
public class HouseAgencyDynaProxyTest2 {

    /**
     * 被代理的对象
     */
    private HireHouseService hireHouseService;

    @Before
    public void setUp() {
        hireHouseService = new HireHouseServiceImpl();
    }

    @After
    public void tearDown() {
    }

    /**
     * 创建代理对象
     */
    @Test
    public void test1() {
        HireHouseService proxyInstance = (HireHouseService) Proxy.newProxyInstance(
                hireHouseService.getClass().getClassLoader(),
                hireHouseService.getClass().getInterfaces(),//被代理的对象所实现的接口
                (proxy, method, arguments) -> {
                    System.out.println("前置工作 ===>> 开始");
                    if (arguments != null) {
                        System.out.print("中介收到房源：");
                        for (String arg : (String[]) arguments[0]) {
                            System.out.print(arg);
                            System.out.print("；");
                        }
                    }
                    System.out.println("\r\n前置工作 ===>> 结束");

                    Object result = method.invoke(this.hireHouseService, arguments);

                    System.out.println("\r\n后置工作 ===>> 结束");
                    System.out.println("中介代理房东租房子：" + result);
                    System.out.println("后置工作 ===>> 结束\r\n");

                    return result + " 正在出租中...";
                }//代理对象
        );
        String result = proxyInstance.hire(new String[]{"房子1", "房子2", "房子3"});
        System.out.println(result);
    }

    /**
     * 为ArrayList<String>作代理
     */
    @Test
    public void test2() {
        List<String> list = new ArrayList<String>();
        List<String> proxyInstance = (List<String>) Proxy.newProxyInstance(
                list.getClass().getClassLoader(),
                list.getClass().getInterfaces(),
                (proxy, method, arguments) -> {
                    System.out.println(System.currentTimeMillis() + "：ArrayList<String>添加元素");
                    return method.invoke(list, arguments);
                }//代理对象
        );
        proxyInstance.add("元素1");
        proxyInstance.add("元素2");
        proxyInstance.add("元素3");

    }

}
