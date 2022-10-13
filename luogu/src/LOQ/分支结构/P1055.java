package LOQ.分支结构;

import java.util.Scanner;

public class P1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn = sc.nextLine();
        int nums = 0;
        String str = isbn.replaceAll("-", "");
        String[] s = str.split("");
//        String[] ss = isbn.split("");
        for (int i = 1; i <= 9; i++) {
            int temp = Integer.parseInt(s[i - 1]);
            nums = nums + temp * i;
        }
        if((nums % 11 == 10 && "X" == s[9]) || (nums % 11 != 10 &&""+nums % 11 == s[9])  ) {
            System.out.println("Right");
        } else if (nums % 11 != 10) {
            System.out.println(isbn.substring(0,isbn.length()-1)+nums%11);
        } else if (nums % 11 == 10) {
            System.out.println(isbn.substring(0,isbn.length()-1)+"X");
        }
    }
}
