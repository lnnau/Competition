import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-31 13:49
 * @Description
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(), N = sc.nextInt(), M = sc.nextInt();
        int[] arr = new int[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        //保存原有石块间隔,N个石块划分N+1间ge
        int[] path = new int[N+1];
        for (int i=0; i < N; i++) {
            path[i] = arr[i+1]-arr[i];
        }
        path[N] = W - arr[N];
        double sum = 0;
        for (int i : path) {
            sum+=i;
        }
        double res = Math.ceil(sum / (N+1));
        System.out.printf("%.0f",res);
    }
}
