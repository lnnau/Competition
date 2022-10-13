package com.twenty;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Project Euler\\data13"));
        String line = br.readLine();
        System.out.println(line);
    }
}
