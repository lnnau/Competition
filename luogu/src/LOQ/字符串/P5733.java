package LOQ.字符串;

import java.util.Scanner;

/*
小写字母转大写字母
 */
public class P5733 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //字符串转字符数组
        char[] chars = s.toCharArray();
        for(int i=0;i<s.length();i++) {
            //判断是否当前是否是小写字母
            if(chars[i]>=97 && chars[i]<=122) {
                chars[i]= (char) (chars[i]-32);
            }
            System.out.print(chars[i]);
        }
    }
}
