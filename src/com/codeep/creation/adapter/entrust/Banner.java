package com.codeep.creation.adapter.entrust;

/**
 * @author codeep
 * @date 2023/7/4 9:59
 * @description:
 */
public class Banner {

    private String string;

    public Banner(String string){
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }

}
