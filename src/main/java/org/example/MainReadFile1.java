package org.example;

import java.io.*;

public class MainReadFile1 {
    public static void main(String[] args) {

        String[] test = new String[]{" guf1 ", " rip2 ", " dno3 "};
        File file = new File("cars.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            int value = bufferedReader.read();
            while (value != -1) {
                stringBuilder.append((char) value);
                value = bufferedReader.read();
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            throw new RuntimeException("Cant read", e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException("cant close buffered writter", e);
                }
            }
        }
    }
}