package com.codeep.behavior.template;

/**
 * @author codeep
 * @date 2023/7/6 11:22
 * @description:
 */
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    /**
     * 注意 final 的使用，防止子类重写统筹逻辑，这是使用抽象类不使用接口的精髓，也是模板设计模式的精髓
     * 还有这里定义处理逻辑，但不定义具体实现，具体实现交给子类，但做大局统筹，故需要方法体（但好像JDK8以后接口也能写方法体，无伤大雅）
     */
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
