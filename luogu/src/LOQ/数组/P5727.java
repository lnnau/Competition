package LOQ.数组;

import java.util.Scanner;

public class P5727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //存放中间值的数组
        int[] arr=new int[200];
        int n=sc.nextInt();
        int count=199;
        while(n!=1) {
            arr[count]=n;
            if(n%2!=0) {
                n=3*n+1;
            } else {
                n=n/2;
            }
            count--;    //1没有加到里面，所以要在单独加一次
        }
        arr[count]=n;
        for(int i=0;i<200;i++) {
            if(arr[i]!=0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
