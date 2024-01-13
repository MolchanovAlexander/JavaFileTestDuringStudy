package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {

       String[] test = new String[]{"guf", "rip", "dno"};
        File file = new File("users.txt");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (String user: test) {
                bufferedWriter.write(user);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("Cant write data to file", e);
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException("cant close buffered writter", e);
                }
            }
        }
    }
}