package com.codeep.structure.bridge;

/**
 * @author codeep
 * @date 2023/7/15 10:22
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, NJFU."));
        d1.display();
        d2.display();
        d3.multiDisplay(6);
    }

}
