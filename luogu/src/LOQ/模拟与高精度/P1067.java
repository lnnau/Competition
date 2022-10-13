package LOQ.模拟与高精度;

import java.util.Scanner;

public class P1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num + 1]; //存放多项式的系数
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp=num;
        for (int i = 0; i < arr.length; i++) {
            if(temp==0) {
                System.out.println(arr[0]);
                break;
            }
            if (temp==num) {  //处理首项
                if (arr[i] == 1) {
                    res += "x^" + num;
                } else if (arr[i] == -1) {
                    res += "-x^" + num;
                } else if (arr[i] < 0) {
                    res += arr[i] + "x^" + num;
                } else if (arr[i] > 0) {
                    res += arr[i] + "x^" + num;
                }
            } else if(num>1) {    //中间项
                if (arr[i] == 1) {
                    res += "+x^" + num;
                } else if (arr[i] == -1) {
                    res += "-x^" + num;
                } else if (arr[i] < 0) {
                    res += arr[i] + "x^" + num;
                } else if (arr[i] > 0) {
                    res += "+"+arr[i] + "x^" + num;
                }
            }else if(num==1) {
                if (arr[i] == 1) {
                    res += "+x";
                } else if (arr[i] == -1) {
                    res += "-x";
                } else if (arr[i] < 0) {
                    res += arr[i] + "x";
                } else if (arr[i] > 0) {
                    res += "+"+arr[i] + "x";
                }
            }else {//末尾
                if (arr[i] < 0) {
                    res += arr[i];
                } else if (arr[i] > 0) {
                    res += "+"+arr[i];
                }
            }
            num--;

        }
        if(temp!=0)
        System.out.println(res);
    }
}