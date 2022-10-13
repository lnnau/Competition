package com.去年决赛;

import java.util.HashMap;
import java.util.Scanner;

public class Test4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        String start = sc.next();
        String end = sc.next();
        HashMap<String,String> hm = new HashMap<>();
        int length=0;   //存储两节点间距离
        for(int i=0;i<line.length();i++) {
            //解析字符串，把结点通过键值对连接起来
            if(line.charAt(i)=='[') {
                String key=line.substring(i+1,i+6);
                String value=line.substring(i+8,i+13);
                hm.put(key,value);
            }
        }
        while(true) {
            String next=hm.get(start);  //从第一个结点开始寻找
            length++;   //每寻找一次长度加一
            if(next.equals(end)) {
                System.out.println(length);
                break;
            }
            //没有找到移动指针
            start=next;
        }
    }
}
