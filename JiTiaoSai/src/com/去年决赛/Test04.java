package com.去年决赛;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //把非数字的给替换掉
        String line=sc.nextLine().replaceAll("[^0-9]"," ");
        String start = sc.next().replaceAll("[^0-9]","");
        String end = sc.next().replaceAll("[^0-9]","");
        int length=0,startnum=0,endnum=0;   //存储两节点间距离
        for(char ch:line.toCharArray()) {   //获取到每一个字符
            //匹配到数字
            if(String.valueOf(ch).matches("[0-9]+")) {
                length++;
                //匹配到要求的A结点
                if(String.valueOf(ch).equals(start)) {
                    //记录当前位置
                    startnum=length;
                }
                //匹配到结束结点
                if(String.valueOf(ch).equals(end)) {
                    endnum=length;
                    break;
                }
            }
        }
        System.out.println(endnum-startnum);
    }
}
