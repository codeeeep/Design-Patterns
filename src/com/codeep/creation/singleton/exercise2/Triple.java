package com.codeep.creation.singleton.exercise2;

import com.codeep.creation.factory_method.idcard.IDCard;

/**
 * @author codeep
 * @date 2023/7/8 11:26
 * @description:
 */
public class Triple {

    private static Triple[] triple = new Triple[]{
            new Triple("0"),
            new Triple("1"),
            new Triple("2"),
    };
    private String code;

    private Triple(String code){
        System.out.println("[Triple id=" + code + "]");
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

    public static Triple getInstanceByCode(String code){
        return triple[Integer.parseInt(code)];
    }

}
