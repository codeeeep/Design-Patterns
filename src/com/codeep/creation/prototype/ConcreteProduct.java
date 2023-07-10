package com.codeep.creation.prototype;

import com.codeep.creation.prototype.framework.Product;

/**
 * @author codeep
 * @date 2023/7/10 19:38
 * @description:
 */
public class ConcreteProduct {

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
