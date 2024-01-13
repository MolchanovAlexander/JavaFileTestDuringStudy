package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

       String[] test = new String[]{"guf", "rip", "dno"};
        File file = new File("users.txt");

        for (String user: test) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))){
                bufferedWriter.write(user);
            } catch (IOException e) {
                throw new RuntimeException("Cant write data to file", e);
            }
        }
    }
}