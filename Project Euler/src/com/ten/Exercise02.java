package com.ten;

public class Exercise02 {
    public static void main(String[] args) {
/*        long[] array = new long[3];   //模拟三个数
        long sum = 2;
        array[0]=1;
        array[1]=2;
        for(int i=2;array[Math.abs(i-1)%3]+array[Math.abs(i-2)%3]<4000000;i++) {
            array[i%3]=array[Math.abs(i-1)%3]+array[Math.abs(i-2)%3];
            if(array[i%3]%2==0) {
                sum+=array[i%3];
            }
        }
        System.out.println(sum);*/

     /*   long[] arr = new long[4000000];
        arr[0]=1;
        arr[1]=2;
        long sum=2;
        for(int i=2;arr[i-1]+arr[i-2]<4000000;i++) {
            arr[i]=arr[i-1]+arr[i-2];
            if(arr[i]%2==0) {
                sum+=arr[i];
            }
        }
        System.out.println(sum);*/
    int num1=1,num2=2;
    int sum=0;
    while(num1<4000000 && num2<4000000) {
        if(num1%2==0)
            sum+=num1;
            num1=num1+num2;

        if(num2%2==0)
            sum+=num2;
            num2=num1+num2;
    }
        System.out.println(sum);//4613732
    }
}
