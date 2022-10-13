package LOQ.分支结构;
/*
给出三条线段 a,b,c,a,b,c 的长度，均是不大于 10000 的整数。打算把这三条线段拼成一个三角形，
它可以是什么三角形呢？

如果三条线段不能组成一个三角形，输出Not triangle；
如果是直角三角形，输出Right triangle；
如果是锐角三角形，输出Acute triangle；
如果是钝角三角形，输出Obtuse triangle；
如果是等腰三角形，输出Isosceles triangle；
如果是等边三角形，输出Equilateral triangle。
 */

import java.util.Arrays;
import java.util.Scanner;
public class P5717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]+arr[1]>arr[2] && arr[0]+arr[2]>arr[1] && arr[1]+arr[2]>arr[0]) {
            if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2]) {
                System.out.println("Right triangle");
            }
            if(arr[0]*arr[0]+arr[1]*arr[1]>arr[2]*arr[2]){
                System.out.println("Acute triangle");
            }
            if(arr[0]*arr[0]+arr[1]*arr[1]<arr[2]*arr[2]) {
                System.out.println("Obtuse triangle");
            }
            if((arr[0]==arr[1] && arr[0]!=arr[2])||(arr[1]==arr[2] && arr[0]!=arr[1])||(arr[0]==arr[2]&&arr[0]!=arr[1])) {
                System.out.println("Isosceles triangle");
            }
            if(arr[0]==arr[1]&&arr[1]==arr[2]) {
                System.out.println("Isosceles triangle");
                System.out.println("Equilateral triangle");
            }
        } else {
            System.out.println("Not triangle");
        }
    }
}
