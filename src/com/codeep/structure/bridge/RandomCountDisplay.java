package com.codeep.structure.bridge;

import java.util.Random;

/**
 * @author codeep
 * @date 2023/7/15 10:34
 * @description:
 */
public class RandomCountDisplay extends CountDisplay{

    private Random random = new Random();

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay (int times) {
        multiDisplay(random.nextInt(times));
    }
}
