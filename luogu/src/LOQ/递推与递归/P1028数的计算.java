package LOQ.递推与递归;
import java.util.Scanner;
public class P1028数的计算 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++) {
            if(i%2==0)
                arr[i]=arr[i-1]+arr[i/2];
            else
                arr[i]=arr[i-1];
        }
        System.out.println(arr[n]);
    }
}
