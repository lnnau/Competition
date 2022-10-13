package com.ten;

public class Exercise06 {
    public static void main(String[] args) {
        long squareSum = 0;
        long sumSquare = 0;
        for(int i=1;i<=100;i++) {
            squareSum+=Math.pow(i,2);
            sumSquare+=i;
        }
        sumSquare= (long) Math.pow(sumSquare,2);
        System.out.println(sumSquare-squareSum);    //25164150
    }
}
