package com.codeep.creation.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author codeep
 * @date 2023/7/11 20:05
 * @description:
 */
public class TextBuilder extends Builder{

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===============================");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('#' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  * " + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==========================\n");
    }

    public String getResult(){
        return buffer.toString();
    }

}
