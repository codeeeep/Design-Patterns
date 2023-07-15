package com.codeep.structure.bridge;

/**
 * @author codeep
 * @date 2023/7/15 10:05
 * @description:
 */
public class CountDisplay extends Display{



    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
