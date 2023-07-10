package com.codeep.creation.prototype;

import com.codeep.creation.prototype.framework.Manager;
import com.codeep.creation.prototype.framework.Product;

/**
 * @author codeep
 * @date 2023/7/9 21:41
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        UnderlinePen upen = new UnderlinePen('~');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello, world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, world.");
        Product p3 = manager.create("slash");
        p3.use("Hello, world");
    }

}
