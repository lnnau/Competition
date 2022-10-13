package com.第十一届;

/**
 * @Author Lunau
 * @Create 2022-03-21 15:43
 * @Description
 * 最坏情况下就是逆序，n个数交换次数为n*(n-1)/2
 * 根据这个特点，求出最接近100的逆序结果，然后找到结果，在此基础
 * 上移动某个单词，把移动次数减少到100即可
 * @Result
 */
public class 排序{

    public static void main(String[] args) {

        for(int i=1; i<20; ++i) {
            System.out.println(i+":"+((i-1)*i/2));		//由此可以发现15个字符的逆序通过冒泡交换成顺序所需要的交换次数最接近100，因此仅需要将onmlkjihgfedcba的第六位移动至第一位即可：jonmlkihgfedcba
        }
    }

}


