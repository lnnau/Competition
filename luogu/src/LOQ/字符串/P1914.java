package LOQ.字符串;

import java.util.Scanner;

public class P1914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //每个字符向后移动的长度
        String s = sc.next();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
//            if (chars[i] - 96 + n <= 26) {
//                chars[i] = (char) (chars[i] + n);
//            } else if (chars[i] == 122 && n % 26 == 0) {
//
//            } else {
//                chars[i] = (char) (96 + (chars[i] - 96 + n) % 26);
            chars[i]= (char) (97+(chars[i]-'a'+n)%26);
            System.out.print(chars[i]);
        }
    }
}
