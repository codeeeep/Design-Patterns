package com.codeep.creation.prototype.framework;

/**
 * @author codeep
 * @date 2023/7/9 21:33
 * @description:
 */
public interface Product extends Cloneable{

    public abstract void use(String s);

    public abstract Product createClone();

}
