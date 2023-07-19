package com.codeep.structure.decorator;

/**
 * @author codeep
 * @date 2023/7/19 21:41
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, world");
        Display d2 = new SideBored(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SideBored(new FullBorder(new FullBorder(new SideBored(new StringDisplay("你好啊"), '*'))), '/');
        d4.show();
    }

}
