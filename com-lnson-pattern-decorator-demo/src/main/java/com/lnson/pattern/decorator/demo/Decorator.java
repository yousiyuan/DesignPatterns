package com.lnson.pattern.decorator.demo;

import com.lnson.pattern.demo.service.ExcelWrite;

/**
 * 装饰者
 */
public class Decorator implements ExcelWrite {

    private ExcelWrite excelWrite;

    public void setExcelWrite(ExcelWrite excelWrite) {
        this.excelWrite = excelWrite;
    }

    @Override
    public final void write() {
        this.beforeAction();
        excelWrite.write();
        this.decorate();
        this.afterAction();
    }

    /**
     * 可重写或置换
     */
    protected void beforeAction() {
        //nothing to do for extension
    }

    /**
     * 不能 重写或置换
     */
    private final void decorate() {
        //TODO:装饰者的逻辑在此完成
        System.out.println("装饰者Decorator为ExcelWrite.write()添加额外的功能");
    }

    /**
     * 可重写或置换
     */
    protected void afterAction() {
        //nothing to do for extension
    }

}
