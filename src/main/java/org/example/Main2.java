package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Main2 {
    public static void main(String[] args) {

       String[] test = new String[]{"guf", "rip", "dno"};
        File file = new File("users.txt");
        for (String user: test) {
            try{
                Files.write(file.toPath(), user.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException("Cant write data to file", e);
            }
        }
    }
}