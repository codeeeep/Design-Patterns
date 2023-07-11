package com.codeep.creation.builder;

/**
 * @author codeep
 * @date 2023/7/11 20:04
 * @description:
 */
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
