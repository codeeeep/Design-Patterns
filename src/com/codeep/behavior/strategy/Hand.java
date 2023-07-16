package com.codeep.behavior.strategy;

/**
 * @author codeep
 * @date 2023/7/16 12:51
 * @description:
 */
public class Hand {

    /**
     * 表示石头的值
     */
    public static final int HANDVALUE_GUU = 0;

    /**
     * 表示剪刀的值
     */
    public static final int HANDVALUE_CHO = 1;

    /**
     * 表示布的值
     */
    public static final int HANDVALUE_PAA = 2;


    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    /**
     * 猜拳中手势对应的字符串
     */
    private static final String[] name = {"石头", "剪刀", "布"};

    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue){
        return hand[handValue];
    }

    /**
     * 根据手势的值获取实例
     * @param h 手势值的实例
     * @return
     */
    public boolean isStrongerThan(Hand h){
        return this.fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h){
        return this.fight(h) == -1;
    }

    /**
     * 计分：平 0， 胜 1， 负 -1
     * @param h
     * @return
     */
    private int fight(Hand h){
        if (this == h){
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue){
            return 1;
        } else{
            return  -1;
        }
    }



    @Override
    public String toString() {
        return "Hand{" +
                "handValue=" + handValue +
                '}';
    }
}
