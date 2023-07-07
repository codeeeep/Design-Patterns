package com.codeep.creation.factory_method.framework;

/**
 * @author codeep
 * @date 2023/7/7 11:54
 * @description:
 */
public abstract class Factory {

    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    /**
     * 创建产品
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册产品
     * @param product
     */
    protected abstract void registerProduct(Product product);

}
