package com.codeep.creation.factory_method;

import com.codeep.creation.factory_method.framework.Factory;
import com.codeep.creation.factory_method.framework.Product;
import com.codeep.creation.factory_method.idcard.IDCard;
import com.codeep.creation.factory_method.idcard.IDCardFactory;

/**
 * @author codeep
 * @date 2023/7/7 12:24
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        // 注意操作，使用构造器就报错，因为我在 IDCard 类中设置的构造器是 默认访问修饰符 的，嘿嘿，这样就可以避免不同包的 Main 类直接
        // 调用 构造器 生成 IDCard 实例，取而代之的是只能通过 factory 实例工厂生成 IDCard
        Product card1 = factory.create("Young");
        Product card2 = factory.create("Jason");
        Product card3 = factory.create("Curry");
        card1.use();
        card2.use();
        card3.use();
    }

}
