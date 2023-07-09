package com.codeep.creation.prototype.framework;

import java.util.HashMap;

/**
 * @author codeep
 * @date 2023/7/9 21:34
 * @description:
 */
public class Manager {

    private HashMap showcase = new HashMap<>();
    public void register(String name, Product proto){
        showcase.put(name, proto);
    }

    public Product create(String protoname){
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }

}
