package com.codeep.creation.prototype;

import com.codeep.creation.prototype.framework.Product;

/**
 * @author codeep
 * @date 2023/7/9 21:41
 * @description:
 */
public class UnderlinePen extends ConcreteProduct implements Product {

    private char ulchar;
    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s){
        // 为啥需要多写个 getBytes(),因为这是在默认的编码中的字符串所需字符数，不加就是 UTF-8，兼容性不好
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }


}
