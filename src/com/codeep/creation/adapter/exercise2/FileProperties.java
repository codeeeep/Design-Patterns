package com.codeep.creation.adapter.exercise2;

import java.io.*;
import java.util.*;

/**
 * @author codeep
 * @date 2023/7/5 11:33
 * @description: Properties 的应用要熟练
 */
public class FileProperties extends Properties implements FileIO{

    @Override
    public void readFromFile(String filename) throws IOException {

        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    @Override
    public void getValue(String key) {
        getProperty(key, "");
    }
}
