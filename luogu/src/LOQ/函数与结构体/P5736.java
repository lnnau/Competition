package LOQ.函数与结构体;

import java.util.Scanner;

public class P5736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++) {
            arr[i]=sc.nextInt();
        }
        getMagicality(arr);
    }
    private static void getMagicality(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            boolean flag=true;
            for(int j=2;j<arr[i];j++) {
                if(arr[i]%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag && arr[i]!=1) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
