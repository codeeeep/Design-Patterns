package com.codeep.creation.iterator;

/**
 * @author codeep
 * @date 2023/7/3 11:18
 * @description: 【迭代器模式】集合接口
 */
public interface Aggregate {

    /**
     * 创建 Iterator
     * @return
     */
    public abstract Iterator iterator();

}
