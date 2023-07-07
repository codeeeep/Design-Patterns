package com.codeep.creation.factory_method.idcard;

import com.codeep.creation.factory_method.framework.Product;

/**
 * @author codeep
 * @date 2023/7/7 11:59
 * @description:
 */
public class IDCard extends Product {

    private String owner;

    /**
     * 注意这里没有使用 public 来修饰构造方法，具体作用稍后再看 TODO
     * @param owner
     */
    IDCard(String owner) {
        System.out.println("制作" + owner + "的 ID 卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的 ID 卡");
    }

    public String getOwner() {
        return owner;
    }

}
