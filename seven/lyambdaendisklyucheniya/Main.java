package com.Lyambda.seven.lyambdaendisklyucheniya;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Saver saver = (obj) -> {
            File file = new File("save.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println(obj.toString());
            pw.close();
        };
        try {
             saver.save("Hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
