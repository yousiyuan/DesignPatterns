package com.lnson.pattern.template.method.demo;

/**
 * 具体模板
 */
public class ConcreteTemplate extends AbstractTemplate {

    @Override
    protected void abstractMethod() {
        //TODO:实现抽象方法
        System.out.println("具体模板方法实现抽象模板方法");
    }

    @Override
    protected void hookMethod() {
        super.hookMethod();
        //TODO:对钩子方法进行扩展
        System.out.println("扩展钩子方法");
    }

}
