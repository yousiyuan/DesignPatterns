package com.lnson.pattern.template.method.demo;

/**
 * 抽象模板方法模式
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法
     * 1、模板方法所代表的行为称为顶级行为，其逻辑称为顶级逻辑。
     * 2、一个模板方法是定义在抽象类中的，把基本操作方法组合在一起形成一个总算法或一个总行为的方法
     * 3、一个抽象类可以有任意多个模板方法，而不限于一个。每一个模板方法都可以调用任意多个具体方法
     * 4、子类可以置换掉父类的可变部分，但是子类却不可以改变模板方法所代表的顶级逻辑。
     */
    public final void templateMethod() {
        abstractMethod();
        hookMethod();
        concreteMethod();
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
        System.out.println("固定的业务逻辑");
    }

    /**
     * 钩子方法
     * 由抽象类声明并实现，而子类会加以扩展。通常抽象类给出的实现是一个空实现，作为方法的默认实现。
     */
    protected void hookMethod() {
    }

}
