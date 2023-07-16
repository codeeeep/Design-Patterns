package com.codeep.behavior.strategy;

/**
 * @author codeep
 * @date 2023/7/16 12:52
 * @description:
 */
public class Player {

    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    /**
     * 胜
     */
    public void win(){
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    /**
     * 负
     */
    public void lose(){
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    /**
     * 平
     */
    public void even(){
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
