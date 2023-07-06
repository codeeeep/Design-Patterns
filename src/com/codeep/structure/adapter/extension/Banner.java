package com.codeep.structure.adapter.extension;

/**
 * @author codeep
 * @date 2023/7/4 9:40
 * @description:
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }

}
