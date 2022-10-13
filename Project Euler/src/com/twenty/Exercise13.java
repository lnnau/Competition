package com.twenty;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Exercise13 {
    public static void main(String[] args) throws IOException {
        //将数据存入文件中，使用字符缓冲流读取数据
        BufferedReader br = new BufferedReader(new FileReader("Project Euler\\data13"));
        String line;
        BigInteger sum = new BigInteger("0");
        //一次读取一行数据
        while ((line = br.readLine())!= null) {
           sum = sum.add(new BigInteger(line));
        }
        String res = sum.toString();
        //截取前十位数
        res = res.substring(0,10);
        System.out.println(res);    //5537376230
    }
}
