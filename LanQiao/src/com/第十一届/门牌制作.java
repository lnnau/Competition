package com.第十一届;

/**
 * @Author Lunau
 * @Create 2022-03-21 14:46
 * @Description
 * @Result  624
 */
public class 门牌制作 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=2020;i++) {
            int tp = i;
            while(tp>0) {
                if(tp%10==2) {
                    count++;
                }
                tp/=10;
            }
        }
        System.out.println(count);
    }
}
