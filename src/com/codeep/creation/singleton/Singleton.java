package com.codeep.creation.singleton;

/**
 * @author codeep
 * @date 2023/7/8 11:11
 * @description:
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了实例");
    }

    public static Singleton getInstance(){
        return singleton;
    }

}
