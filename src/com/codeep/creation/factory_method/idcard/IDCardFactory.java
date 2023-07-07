package com.codeep.creation.factory_method.idcard;

import com.codeep.creation.factory_method.framework.Factory;
import com.codeep.creation.factory_method.framework.Product;

import java.util.*;

/**
 * @author codeep
 * @date 2023/7/7 12:03
 * @description:
 */
public class IDCardFactory extends Factory {

    private Map database = new HashMap(10);
    private int code = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, code++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getCode(), card.getOwner());
    }

    public Hashtable getDatabase(){
        return (Hashtable) database;
    }
}
