package LOQ.循环结构;

import java.util.Scanner;
public class P1307 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=0;
        String s=""+num;
        int len=0;
        if(num>=0) {
           len=s.length();
        } else {
            len=s.length()-1;
        }
            for(int i=1;i<=len;i++) {
                temp=temp*10+num%10;
                num=num/10;
            }
            System.out.println(temp);
    }
}