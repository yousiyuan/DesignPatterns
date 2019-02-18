package com.lnson.pattern.abs.decorator.demo;

import com.lnson.pattern.demo.service.ExcelWrite;

/**
 * 抽象装饰者
 * (通过模板方法模式进行扩展)
 */
public abstract class DecoratorTemplate implements ExcelWrite {

    private ExcelWrite excelWrite;

    public void setExcelWrite(ExcelWrite excelWrite) {
        this.excelWrite = excelWrite;
    }

    @Override
    public final void write() {
        this.abstractMethod();
        excelWrite.write();
        this.concreteMethod();
        this.hookMethod();
    }

    /**
     * 抽象方法
     * 由抽象类声明，由具体子类实现
     */
    protected abstract void abstractMethod();

    /**
     * 具体方法
     * 由抽象类声明并实现，而子类并不实现或置换
     */
    private final void concreteMethod() {
        // 业务相关的代码
        System.out.println("抽象装饰者完成固定的业务逻辑");
    }

    /**
     * 钩子方法
     * 由抽象类声明并实现，而子类会加以扩展。通常抽象类给出的实现是一个空实现，作为方法的默认实现。
     */
    protected void hookMethod() {
    }

}
