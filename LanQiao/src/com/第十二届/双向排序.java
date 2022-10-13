package com.第十二届;
/**
 * @Author Lunau
 * @Create 2022-03-14 20:43
 * @Description
 * @Result
 */
import java.util.*;
public class 双向排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] con = new int[m][2];
        //把序列先按照升序放入数组
        int[] arr = new int[m];
        for (int i = 1; i <= m; i++) {
            arr[i-1] = i;
        }
        //存入控制元素
        for(int i=0;i<m;i++) {
            con[i][0] = sc.nextInt();
            con[i][1]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            sort(con[i][0],con[i][1],arr);
        }
        for(int i=0;i<con.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //排序操作
    private static void sort(int p, int q, int[] con) {
        //升序排列
        if (p == 1) {
            Arrays.sort(con, q - 1, con.length);
//            bubbleSort2(con,q-1);
        } else {
            bubbleSort(con,q);
        }
    }

    //降序排列
    private static void bubbleSort(int[] con, int q) {
        for (int i = 0; i < q; i++) {
            for(int j=0;j<q-1-i;j++) {
                if(con[j]<con[j+1]) {
                    int tp = con[j];
                    con[j] = con[j+1];
                    con[j+1] = tp;
                }
            }
        }
    }
    //升序排列
  /*  private static void bubbleSort2(int[] con, int q) {
        for (int i = q; i < con.length-1; i++) {
            for(int j=q;j<con.length-1;j++) {
                if(con[j]>con[j+1]) {
                    int tp = con[j];
                    con[j] = con[j+1];
                    con[j+1] = tp;
                }
            }
        }
    }*/

}