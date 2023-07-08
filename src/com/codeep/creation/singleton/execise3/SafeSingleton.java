package com.codeep.creation.singleton.execise3;

/**
 * @author codeep
 * @date 2023/7/8 13:08
 * @description:
 */
public class SafeSingleton {

    private static SafeSingleton singleton = null;
    private SafeSingleton(){
        System.out.println("生成了一个实例");

    }

    /**
     * 注意 synchronized 使用，少了这句话就不是正经的懒汉式线程安全单例模式了
     * @return
     */
    public static synchronized SafeSingleton getInstance(){
        if (singleton == null){
            singleton =  new SafeSingleton();
        }
        return singleton;
    }

    private void slowdown(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
