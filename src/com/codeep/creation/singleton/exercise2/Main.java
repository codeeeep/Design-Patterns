package com.codeep.creation.singleton.exercise2;

/**
 * @author codeep
 * @date 2023/7/8 11:36
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstanceByCode(String.valueOf(i % 3));
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }

}
