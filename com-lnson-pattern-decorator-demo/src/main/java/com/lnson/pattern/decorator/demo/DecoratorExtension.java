package com.lnson.pattern.decorator.demo;

import com.lnson.pattern.demo.service.ExcelWrite;

/**
 * 装饰者的扩展
 */
public class DecoratorExtension extends Decorator {

    public DecoratorExtension() {
        super();
    }

    @Override
    protected void beforeAction() {
        super.beforeAction();
        //TODO:扩展装饰者的功能
        System.out.println("扩展装饰者--->前置扩展");
    }

    @Override
    protected void afterAction() {
        super.afterAction();
        //TODO:扩展装饰者的功能
        System.out.println("扩展装饰者--->后置扩展");
    }

}
