package com.codeep.behavior.strategy;

/**
 * @author codeep
 * @date 2023/7/16 12:51
 * @description:
 */
public interface Strategy {

    public abstract Hand nextHand();

    public abstract void study(boolean win);

}
