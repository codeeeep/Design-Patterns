package com.codeep.behavior.template;

/**
 * @author codeep
 * @date 2023/7/6 11:26
 * @description:
 */
public class StringDisplay extends AbstractDisplay{

    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void open() {
        System.out.println("---------------");
    }

    @Override
    public void print() {
        printLine();
        System.out.print("|" + string + "|");
        printLine();
    }

    @Override
    public void close() {
        System.out.println("----------------");
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }

}
