package LOQ.暴力枚举;

import java.util.Scanner;

/**
 * 注意：
 * 组成A:B:C的排列是从1-9中选，1-9只能出现一次
 */
public class P1618三连击升级版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prop = new int[3];
        prop[0]=sc.nextInt();
        prop[1]=sc.nextInt();
        prop[2]=sc.nextInt();
        //存放1-9数字状态，0,：未使用，1：使用

        int count = 0;

        for (int n1=1;n1<4;n1++) {  //第一组数
            int[] arr = new int[10];
            arr[n1] = 1;
            for (int n2=checkNum(arr);n2!=0;n2=checkNum(arr)) {
                for (int n3=checkNum(arr);n3!=0;n3=checkNum(arr)) {
                    for (int n4=checkNum(arr);n4<7;n4++) {
                        for (int n5=checkNum(arr);n5!=0;n5=checkNum(arr)) {
                            for (int n6=checkNum(arr);n6!=0;n6=checkNum(arr)) {
                                for (int n7=checkNum(arr);n7<=9;n7++) {
                                    for (int n8=checkNum(arr);n8!=0;n8=checkNum(arr)) {
                                        for (int n9=checkNum(arr);n9!=0;n9=checkNum(arr)) {
                                            int s1 = Integer.parseInt(""+n1+n2+n3);
                                            int s2 = Integer.parseInt(""+n4+n5+n6);
                                            int s3 = Integer.parseInt(""+n7+n8+n9);
                                            if (s3/prop[2]==s2 && s2/prop[1]==s1) {
                                                count++;
                                                System.out.println(s1+" "+s2+" "+s3);
                                            }
//                                            //把数字状态全部重置
//                                            for (int i=1;i<=9;i++) {
//                                                arr[i] = 0;
//                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (count==0) {
            System.out.println("No!!!");
        }
    }
    //检查该数是否被使用
    private static int checkNum(int[] arr) {
        int res = 0;
        for (int i=1;i<=9;i++) { //未使用返回
            if (arr[i]==0) {
                arr[i] = 1;
                return i;
            }
        }
        //全部被使用
        return 0;
    }
}
