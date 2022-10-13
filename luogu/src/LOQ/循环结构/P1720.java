package LOQ.循环结构;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
斐波那契数列
 */
public class P1720 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(f(Integer.parseInt(br.readLine()))+".00");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=2)
        System.out.println(ff(n)+".00");
        else if(n==0)System.out.println("0.00");
        else if(n==1) System.out.println("1.00");
    }
    static int f(int n) {
        if(n<=2) return 1;
        else return f(n-1)+f(n-2);
    }
    static long ff(int n) {
       int[] arr=new int[n+1];
       arr[1]=1;
       arr[2]=1;
       for(int i=3;i<=n;i++) {
           arr[i]=arr[i-1]+arr[i-2];
       }
       return arr[n];
    }
}
