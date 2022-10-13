package top.two;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-05-11 20:12
 * @Description
 * @Result
 */
/*
1:11*5
2:14*7
3:17*9
n:11+3*(n-1) 5+2*(n-1)
*/
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String row = "###";
        String colu = "#";
        //在基础上对n进行处理
        for(int i=0;i<n;i++) {
            row+="#";
//            colu+="#";
        }
        //按行输出结果
        for(int i=0;i<5+n*2;i++) {
            if(i==0 || i==2+n || i==5+n*2-1) {
                for(int j=0;j<3;j++) {
                    if(j!=2)
                        System.out.print(row+" ");
                    else
                        System.out.print(row);
                }
            } else {
                for(int j=0;j<11+3*n;j++) {
                    if(i<2+n) {
                        if (j==0||j==11+3*n-1||j==2+n||j==4+n) {
                            System.out.print(colu);
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (j==0||j==11+3*n-1||j==2+n||j==4+n||j==6+2*n) {
                            System.out.print(colu);
                        } else {
                            System.out.print(" ");
                        }
                    }

                }
            }
            if(i!=5+n*2-1)
            System.out.println();   //换行
        }
    }
}
