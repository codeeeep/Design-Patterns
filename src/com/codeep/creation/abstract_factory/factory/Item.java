package com.codeep.creation.abstract_factory.factory;

/**
 * @author codeep
 * @date 2023/7/13 13:39
 * @description:
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
