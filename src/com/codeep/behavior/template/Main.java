package com.codeep.behavior.template;

/**
 * @author codeep
 * @date 2023/7/6 11:38
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        AbstractDisplay c1 = new CharDisplay('C');
        AbstractDisplay c2 = new StringDisplay("Hello, World.");
        AbstractDisplay c3 = new StringDisplay("你好，世界。");
        c1.display();
        c2.display();
        c3.display();
    }

}
