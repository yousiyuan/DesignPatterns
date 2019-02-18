package com.lnson.pattern.abs.decorator.demo;

/**
 * Excel装饰器
 */
public class ExcelDecorator extends DecoratorTemplate {

    public ExcelDecorator() {
        super();
    }

    @Override
    protected void abstractMethod() {
        System.out.println("装饰者--->前置装饰");
    }

    @Override
    protected void hookMethod() {
        super.hookMethod();
        System.out.println("装饰者--->后置装饰");
    }

}
