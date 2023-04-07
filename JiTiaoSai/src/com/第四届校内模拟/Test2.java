package com.第四届校内模拟;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-09 11:29
 * @Description
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] strs =  new String[n][5];
        sc.nextLine();
        for (int i=0; i<n; i++) {
            String[] s = sc.nextLine().split(" ");
            strs[i] = s;
        }

        int res = 0;
        for (int i = 0; i<n; i++) {//
            //本地绿码完全接种
            if (strs[i][0].equals("L") && strs[i][1].equals("G") && strs[i][2].equals("C")) {
                res++;
            } else if(strs[i][0].equals("T") && strs[i][1].equals("G") && strs[i][2].equals("C") && strs[i][3].equals("N") && Integer.parseInt(strs[i][4]) < 2) {
                res++;
            }
        }
        System.out.print(res);
    }
}
