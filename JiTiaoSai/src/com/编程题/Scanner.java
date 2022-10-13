package com.编程题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Scanner {
    public Scanner(InputStream in) {
    }

    public static void main(String[] args) {

        System.out.println("ReadTest, Please Enter Data:");
        InputStreamReader is = new InputStreamReader(System.in); //new构造InputStreamReader对象
        BufferedReader br = new BufferedReader(is); //拿构造的方法传到BufferedReader中
        try{ //该方法中有个IOExcepiton需要捕获
            String name = br.readLine();
            System.out.println("ReadTest Output:" + name);
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }
}
