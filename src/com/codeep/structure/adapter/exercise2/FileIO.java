package com.codeep.structure.adapter.exercise2;

import java.io.*;

/**
 * @author codeep
 * @date 2023/7/5 11:27
 * @description:
 */
public interface FileIO {

    /**
     * 从文件中读取
     * @param filename 读取的文件名称（带后缀）
     * @throws IOException
     */
    public void readFromFile(String filename) throws IOException;

    /**
     * 把输入的写入文件中
     * @param filename 输入的文件名称（带后缀）
     * @throws IOException
     */
    public void writeToFile(String filename) throws IOException;

    /**
     * 设置键值对
     * @param key 键
     * @param value 值
     */
    public void setValue(String key, String value);

    /**
     * 根据键来取值
     * @param key 键
     */
    public void getValue(String key);

}
