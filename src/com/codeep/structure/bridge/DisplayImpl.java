package com.codeep.structure.bridge;

/**
 * @author codeep
 * @date 2023/7/15 10:06
 * @description:
 */
public abstract class DisplayImpl {

    /**
     * 打印框框的头
     */
    public abstract void rawOpen();

    /**
     * 打印框框的边和显示字符串
     */
    public abstract void rawPrint();

    /**
     * 打印框框的底
     */
    public abstract void rawClose();

}
