package com.codeep.creation.singleton.execise3;

import com.codeep.creation.singleton.Singleton;

/**
 * @author codeep
 * @date 2023/7/8 13:08
 * @description:
 */
public class Main extends Thread {


    public static void main(String[] args) {
        System.out.println("Start.");
        new Main("线程1").start();
        new Main("线程2").start();
        new Main("线程3").start();
        System.out.println("End.");
    }

    @Override
    public void run() {
        SafeSingleton instance = SafeSingleton.getInstance();
        System.out.println(getName() + ": instance =" + instance);
    }

    public Main(String name) {
        super(name);
    }
}
