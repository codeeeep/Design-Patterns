package com.codeep.structure.bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author codeep
 * @date 2023/7/15 10:42
 * @description:
 */
public class FileDisplayImpl extends DisplayImpl{

    private String filename;
    private BufferedReader reader;
    /**
     *  循环显示的极限（缓存大小限制）
     */
    private static final int MAX_READAHEAD_LIMIT = 4096;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=-=-=-=-= " + filename + " =-=-=-=-=");
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            reader.reset();
            while ((line = reader.readLine()) != null){
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("=-=-=-=-=-= ");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
