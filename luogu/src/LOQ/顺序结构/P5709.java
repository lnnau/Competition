package LOQ.顺序结构;

import java.util.Scanner;

public class P5709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(),t=sc.nextInt(),s=sc.nextInt();
        int nums;
        int a=0;
        if(t>0) {
            nums=m-(s/t);
            if(nums<=0)
            System.out.println(a);
            else
                System.out.println(nums);
        } else {
            System.out.println(a);
        }
    }
}
