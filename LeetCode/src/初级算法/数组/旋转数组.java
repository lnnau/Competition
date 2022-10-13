package 初级算法.数组;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-14 11:02
 * @Description
 */
public class 旋转数组 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
        public static void rotate(int[] nums, int k) {
            int len = nums.length;
            int[] res = new int[len];
            for (int i=0; i<len;i++) {
                res[(k+i)%len] = nums[i];
            }
            for (int i=0; i<len; i++) {
                nums[i] = res[i];
            }
        }
}
