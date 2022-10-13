package LOQ.暴力枚举;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-03 17:16
 * @Description
 * @Result
 */
public class P1008三连击 {
    public static void main(String[] args) {
        int b,c;
        for(int a = 123;a<=329;a++) {
            b = a * 2;
            c = a * 3;
            if (judge(a,b,c)) {
                System.out.println(a+" "+b+" "+c);
            }
        }
    }
    public static Boolean judge(int a,int b,int c) {
        String str = ""+a+b+c;
        if (str.contains("1")&&str.contains("2")&&str.contains("3")&&str.contains("4")
                &&str.contains("5")&&str.contains("6")&&str.contains("7")&&str.contains("8")&&str.contains("9")) {
            return true;
        }
        return false;
    }
}
