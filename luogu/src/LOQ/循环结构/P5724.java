package LOQ.循环结构;

import java.util.Scanner;

/*
评委打分去掉最大分和最小分（有多个最大分或者最小分也只需要去掉一个）
 */
public class P5724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//评委的个数
        int min=10;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++) {
            int temp=sc.nextInt();
            if(temp<min) {
                min=temp;
            } else if(temp>max) {
                max=temp;
            }
            sum+=temp;
        }
        double result=(double)(sum-max-min)/(n-2);
        System.out.printf("%.2f",result);
    }
}
