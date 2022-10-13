package LOQ.循环结构;

import java.util.Scanner;

public class P5723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();
        //存放质数和
        int sum=0;
        //存放当前口袋中质数个数
        int count=0;
        for(int i=2;sum<=L;i++) {
            boolean flag=true;
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                sum=sum+i;
                if(sum<=L) {    //多加一层判断
                    count++;
                    System.out.println(i);
                }
            }
        }
        System.out.println(sum+" "+count);
    }
}
