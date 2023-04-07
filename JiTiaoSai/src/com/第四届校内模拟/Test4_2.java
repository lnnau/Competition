package com.第四届校内模拟;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-09 18:02
 * @Description
 */
public class Test4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] strs = new String[n][5];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            strs[i] = s;
        }

        int A = 0, B = 0;
        for (int i = 0; i < n; i++) {
            String[] pep = strs[i];
            //满足健康码为绿码，或者近三天核酸为阴性
            if (pep[1].equals("G") || (!pep[1].equals("G") && pep[3].equals("N") && Integer.parseInt(pep[4]) < 3)) {
                //本地人员
                if (pep[0].equals("L")) {
                    //部分接种，接种A
                    if (pep[2].equals("D")) {
                        A++;
                        //未接种，接种B
                    } else if (pep[2].equals("E")) {
                        B++;
                    }
                    //外地人员
                } else {
                    //未接种，接种B
                    if (pep[2].equals("E")) {
                        B++;
                    }
                }
            }
        }
        System.out.print(A+" "+B);
    }
}