package LOQ.数组;
import java.util.Scanner;

public class P2911 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        //存放和出现概率的数组    和的范围6-60
        int[] arr = new int[81];
        //输入三个骰子的面数
        int s1=sc.nextInt(),s2=sc.nextInt(),s3=sc.nextInt();
        for(int i=1; i<=s1;i++) {
            for(int j=1;j<=s2;j++) {
                for(int n=1;n<=s3;n++) {
                        max=n+i+j;
                        arr[max]++; //数组索引存放的是骰子的和，数组的值是该和出现的次数
                }
            }
        }
        max=0;
        int index=-1;
        for(int i=3;i<=80;i++) {
            if(arr[i]>max) {   //当有多个和出现的次数相同时，保证只获取到了最小出现的那个和
                max=arr[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
