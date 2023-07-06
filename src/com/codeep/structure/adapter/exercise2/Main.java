package com.codeep.structure.adapter.exercise2;

import java.io.IOException;

/**
 * @author codeep
 * @date 2023/7/5 11:26
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src/com/codeep/creation/adapter/exercise2/file.txt");
            f.setValue("year", "2023");
            f.setValue("month", "7");
            f.setValue("day", "5");
            f.writeToFile("src/com/codeep/creation/adapter/exercise2/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
