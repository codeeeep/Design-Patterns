package com.codeep.creation.factory_method.idcard;

import com.codeep.creation.factory_method.framework.Factory;
import com.codeep.creation.factory_method.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author codeep
 * @date 2023/7/7 12:03
 * @description:
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
