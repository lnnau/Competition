package LOQ.字符串;
import java.util.Scanner;
/*
被覆盖的单词
 */
public class P1321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] chars = line.toCharArray();
        int boy=0,gril=0;
        for(int i=0;i<line.length();) {
            if(chars[i]=='b'&&chars[i+1]=='o'&&chars[i+2]=='y') {   //没有被覆盖
                boy++;
                i+=3;
            } else if((chars[i]=='b'&&chars[i+1]=='o') || (chars[i]=='o'&&chars[i+1]=='y')) {
                boy++;
                i+=2;   //覆盖了一个
            } else if(chars[i]=='b'||chars[i]=='o'||chars[i]=='y') {
                boy++;
                i++;
            } else if(chars[i]=='g'&&chars[i+1]=='i'&&chars[i+2]=='r'&&chars[i+3]=='l') {
                gril++;
                i+=4;
            } else if((chars[i]=='g'&&chars[i+1]=='i'&&chars[i+2]=='r')||(chars[i]=='i'&&chars[i+1]=='r'&&chars[i+2]=='l')) {
                //覆盖了一个
                gril++;
                i+=3;
            } else if((chars[i]=='g'&&chars[i+1]=='i')||(chars[i]=='i'&&chars[i+1]=='r')||(chars[i]=='r'&&chars[i+1]=='l')) {
                //覆盖两个
                gril++;
                i+=2;
            } else if(chars[i]=='g'||chars[i]=='r'||chars[i]=='i'||chars[i]=='l') {
                gril++;
                i++;
            } else {
                i++;
            }
        }
        System.out.println(boy);
        System.out.println(gril);
    }
}
