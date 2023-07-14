package com.codeep.creation.abstract_factory.factory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author codeep
 * @date 2023/7/13 13:40
 * @description:
 */
public abstract class Page {

    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "编写完成。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();

}
