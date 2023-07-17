package com.codeep.structure.composite;

/**
 * @author codeep
 * @date 2023/7/17 18:54
 * @description:
 */
public class File extends Entry{

    private String name;

    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
