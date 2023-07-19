package com.codeep.structure.decorator;

/**
 * @author codeep
 * @date 2023/7/19 21:39
 * @description:
 */
public abstract class Display {

    /**
     * 获取列数，用于装饰物的长度衡量
     * @return
     */
    public abstract int getColumns();

    /**
     * 获取行数，用于装饰物的高度衡量
     * @return
     */
    public abstract int getRows();

    /**
     * 获取给定行的字符串（从 0 开始）
     * @param row
     * @return
     */
    public abstract String getRowText(int row);

    /**
     * 根据行号去打印字符串
     */
    public final void show(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
