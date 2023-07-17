package com.codeep.structure.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author codeep
 * @date 2023/7/17 18:54
 * @description:
 */
public class Directory extends Entry{

    private String name;
    private ArrayList directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * 文件夹大小直接递归处理
     * @return
     */
    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
