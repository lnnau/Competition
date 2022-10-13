package top.plutos;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //将字符转换成对应的ASCII码存储到char数组中
        char[] ch = sc.nextLine().toCharArray();
        int[] arr = new int[128];
        //统计每个字符出现的次数
        for(int i=0;i<ch.length;i++) {
            arr[ch[i]]++;
        }
        int max = 0;
        StringBuffer sb = new StringBuffer();
        //得出出现最多次数的个数
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        //把出现次数最多的字符按照字典顺序组合
        for(int i=65;i<128;i++) {
            if(arr[i]==max) {
                sb.append((char)i);
            }
        }
        System.out.println(sb);
    }
}
