package com.基础;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

/*
十六进制转8进制
 */
public class Main12 {
    public static void main(String[] args) {
        //要转换的个数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<Integer> al2 = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;++i) {
            al.add(sc.nextLine());
        }
        //十六进制转十进制
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("A",10);
        hm.put("B",11);
        hm.put("C",12);
        hm.put("D",13);
        hm.put("E",14);
        hm.put("F",15);
        for(int i=0;i<n;++i) {
            int sum=0;
            String[] s = al.get(i).split("");
            double length = s.length;
            for(int j=0;j<length;j++) {
                if(hm.containsKey(s[j])){
                    int v = (int) (hm.get(s[j]) * Math.pow(16, length-j-1));
                    sum=sum+v;
                } else {
                    sum= (int) (sum+Integer.parseInt(s[j])*Math.pow(16,length-j-1));
                }
            }
            al2.add(sum);
        }
//        for(Integer i:al2) {
//            System.out.println(i);
//        }
        //十进制转八进制
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<al2.size();++i) {
            int temp = al2.get(i);
            String s = temp+"";
            for(int j=0;j<s.length();j++) {
                int ruzhan = temp%8;
                stack.push(ruzhan);
                temp=temp/8;
            }
            while(!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
