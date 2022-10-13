package LOQ.字符串;
import java.util.Scanner;
/*
九键按了多少次
 */
public class P1765 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int nums=0;   //按键盘的次数
        for(char ch:line.toCharArray()) {
            if(ch=='a'||ch=='d'||ch=='g'||ch=='j'||ch=='m'||ch=='p'||ch=='t'||ch=='w'||ch==' ') {
                nums+=1;
            } else if(ch=='b'||ch=='e'||ch=='h'||ch=='k'||ch=='n'||ch=='u'||ch=='x'||ch=='q') {
                nums+=2;
            } else if(ch=='s'||ch=='z') {
                nums+=4;
            } else {
                nums+=3;
            }
        }
        System.out.println(nums);
    }
}
