package LOQ.循环结构;

import java.util.Scanner;
/*
    存储计划
 */
public class P1089 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        //存起来的钱
        int sum=0;
        //月份计数器
        int count=1;
        //月初手中的钱
        int p=0;
        int q=0;
        for(int i=0;i<12;i++) {
            int money=sc.nextInt();
            p=q+300;
            if(p-money>=100) {
                sum=sum+((p-money)/100)*100;
                q=p-money-((p-money)/100)*100;
            } else if(p-money<0){
                System.out.println("-"+count);
                break;
            } else {
                q=p-money;
            }
            count++;
        }
        if(count==13)
        System.out.printf("%.0f",sum*1.2+q);
    }
}
