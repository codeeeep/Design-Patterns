package com.codeep.behavior.strategy;

import java.util.Scanner;

/**
 * @author codeep
 * @date 2023/7/16 12:52
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        int seed1, seed2;
        System.out.println("请输入两个随机数种子");
        Scanner scanner = new Scanner(System.in);
        seed1 = scanner.nextInt();
        seed2 = scanner.nextInt();
        Player codeep = new Player("Codeep", new WinningStrategy(seed1));
        Player biki = new Player("Biki", new ProbStrategy(seed2));
        for (int i = 0; i < 100000; i++) {
            Hand nextHand1 = codeep.nextHand();
            Hand nextHand2 = biki.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("Winner:" + codeep);
                codeep.win();
                biki.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner:" + biki);
                codeep.lose();
                biki.win();
            } else {
                System.out.println("Even...");
                codeep.even();
                biki.even();
            }
        }

        System.out.println("====================");
        System.out.println("Total result:");
        System.out.println(codeep);
        System.out.println(biki);

    }

}
