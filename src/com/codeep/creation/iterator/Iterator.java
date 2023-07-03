package com.codeep.creation.iterator;

/**
 * @author codeep
 * @date 2023/7/3 11:20
 * @description: 【迭代器模式】迭代器接口
 */
public interface Iterator {

    /**
     * 是否有下一个，用于循环控制
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 返回下一个元素
     * @return
     */
    public abstract Object next();

}
