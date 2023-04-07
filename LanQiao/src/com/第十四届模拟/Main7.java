package com.第十四届模拟;

import java.util.*;

/**
 * @Author Lunau
 * @Create 2022-12-03 16:41
 * @Description
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        HashSet<String> set = new LinkedHashSet<>();    //元素唯一且有序
        for (int i=0;i<n;i++) {
            set.add(sc.nextLine());
        }
        int len = set.size();
        int count = 1;
        for (String value : set) {
            if (count<len)
                System.out.println(value);
            else
                System.out.print(value);
            count++;
        }
    }
}
