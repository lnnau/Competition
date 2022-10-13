package LOQ.循环结构;

import java.util.Scanner;

public class P1980Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int count=0;
        int temp;
        for(int i=1;i<=n;i++) {
            String s = i+"";
            //位数小于1直接比较
            if(s.length()<=1) {
                if(i==x) {
                    count++;
                }
            } else {
                //位数大于1需要多次求余比较
                for(int j=0;j<s.length();j++) {
                    int num = i;
                    if(num%10==x && num!=10) {
                        count++;
                    } else if(num==10 && (x==1||x==0)) {
                        count++;
                        break;
                    }
                    num=num/10;
                }
            }
        }
        System.out.println(count);
    }
}
