package com.codeep.creation.builder;

/**
 * @author codeep
 * @date 2023/7/11 20:05
 * @description:
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("南林暑期实训");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{
                "早上学了 Python",
                "下午学了 Python 模块化"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "学点 Vue",
                "学点 设计模式",
                "学点 算法"
        });
        builder.close();
    }

}
