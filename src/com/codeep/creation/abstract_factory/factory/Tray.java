package com.codeep.creation.abstract_factory.factory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author codeep
 * @date 2023/7/13 13:40
 * @description:
 */
public abstract class Tray extends Item{

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }

}
