package com.twenty;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise18 {
    public static void main(String[] args) throws IOException {
        //从文件中读取数据
        BufferedReader br = new BufferedReader(new FileReader("Project Euler/data18.txt"));
        int[][] strings = new int[17][17];
        String str = "";
        int j = 1;  //层数
        while((str = br.readLine())!=null) {
            //将获取到的一层数据分隔的到字符串数组
            String[] split = str.split(" ");
            for(int i=0;i<split.length;i++) {
                strings[j][i] = Integer.parseInt(split[i]);
            }
            //层数加一
            j++;
        }
        for(int m=15;m>=1;m--) {    //层数从高到低
            for(int n=0;n<=14;n++) {//从左到右
                //动态转移方程
                strings[m][n] = Math.max(strings[m+1][n],strings[m+1][n+1])+strings[m][n];
            }
        }
        System.out.println(strings[1][0]);
    }
}
