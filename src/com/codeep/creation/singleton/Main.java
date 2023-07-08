package com.codeep.creation.singleton;

/**
 * @author codeep
 * @date 2023/7/8 11:13
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("singleton1 和 singleton2 是同一个实例");
        }else {
            System.out.println("不是同一个实例");
        }
        System.out.println("End.");
    }

}
