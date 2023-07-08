package com.codeep.creation.singleton.exercise1;

/**
 * @author codeep
 * @date 2023/7/8 11:18
 * @description: 额这个例子相当于硬塞了，我还以为不能该 ticket++，但数量只能保持 100 呢
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");
    }

}
