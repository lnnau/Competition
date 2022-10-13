package com.算法;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-03-30 10:37
 * @Description
 * @Result
 */
public class 移动零283 {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int p = 0;
        for(int q=0;q<nums.length;q++) {
            if (nums[p]!=0) {
                //q扫描到非0就把q当前值移动到p
                nums[p++]=nums[q];
            }
        }
        for(int i=p;i<nums.length;i++) {
            nums[i]=0;
        }
    }
}
