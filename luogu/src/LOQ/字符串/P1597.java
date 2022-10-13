package LOQ.字符串;

import java.util.Scanner;

public class P1597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        int a=0,b=0,c=0;
        for(int i=0;i<ch.length;i+=5) {
            switch (ch[i]) {    //匹配左值
                case 'a':
                    if(ch[i+3]<='9' && ch[i+3]>='0') {//右值为数字
                        a=ch[i+3]-48;
                    } else if(ch[i+3]=='b') {
                        a=b;
                    } else if(ch[i+3]=='c') {
                        a=c;
                    }
                    break;
                case 'b':
                    if(ch[i+3]<='9' && ch[i+3]>='0') {//右值为数字
                        b=ch[i+3]-48;
                    } else if(ch[i+3]=='a') {
                        b=a;
                    } else if(ch[i+3]=='c') {
                        b=c;
                    }
                    break;
                case 'c':
                    if(ch[i+3]<='9' && ch[i+3]>='0') {//右值为数字
                        c=ch[i+3]-48;
                    } else if(ch[i+3]=='b') {
                        c=b;
                    } else if(ch[i+3]=='a') {
                        c=a;
                    }
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
}
