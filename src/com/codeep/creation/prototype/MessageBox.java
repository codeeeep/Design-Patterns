package com.codeep.creation.prototype;

import com.codeep.creation.prototype.framework.Product;

import java.nio.charset.StandardCharsets;

/**
 * @author codeep
 * @date 2023/7/9 21:41
 * @description:
 */
public class MessageBox implements Product {

    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }
    public void use(String s){
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.println(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.println(decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  p;
    }

}
