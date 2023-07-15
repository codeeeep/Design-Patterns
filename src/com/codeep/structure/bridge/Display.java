package com.codeep.structure.bridge;

/**
 * @author codeep
 * @date 2023/7/15 10:05
 * @description:
 */
public class Display {

    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public void display(){
        open();
        print();
        close();
    }

}
