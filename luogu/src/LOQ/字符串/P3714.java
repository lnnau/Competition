package LOQ.字符串;
import java.util.Scanner;
/*
honoko的键盘
 */
public class P3714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count1=0,count2=0;
        char[] ch = sc.next().toCharArray();
        for(int i=0;i<n-1;i++) {//第一次遍历将本来是VK的记录下来，并且改变
            if(ch[i] == 'V' &&ch[i+1]=='K') {
                count1++;
                ch[i]=ch[i+1]='X';
            }
        }
        for(int i=0;i<n-1;i++) {//第二次遍历把同一字符出现两次的给算上，只能算一次
            if(ch[i]!='X'&&ch[i]==ch[i+1]) {
                count2++;
                break;
            }
        }
        System.out.println(count1+count2);
    }
}
