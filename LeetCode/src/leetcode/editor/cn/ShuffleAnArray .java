//给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。打乱后，数组的所有排列应该是 等可能 的。 
//
// 实现 Solution class: 
//
// 
// Solution(int[] nums) 使用整数数组 nums 初始化对象 
// int[] reset() 重设数组到它的初始状态并返回 
// int[] shuffle() 返回数组随机打乱后的结果 
// 
//
// 
//
// 示例 1： 
//
// 
//输入
//["Solution", "shuffle", "reset", "shuffle"]
//[[[1, 2, 3]], [], [], []]
//输出
//[null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]
//
//解释
//Solution solution = new Solution([1, 2, 3]);
//solution.shuffle();    // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。例如，返回 [3, 
//1, 2]
//solution.reset();      // 重设数组到它的初始状态 [1, 2, 3] 。返回 [1, 2, 3]
//solution.shuffle();    // 随机返回数组 [1, 2, 3] 打乱后的结果。例如，返回 [1, 3, 2]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50 
// -10⁶ <= nums[i] <= 10⁶ 
// nums 中的所有元素都是 唯一的 
// 最多可以调用 10⁴ 次 reset 和 shuffle 
// 
//
// Related Topics 数组 数学 随机化 👍 310 👎 0

 
package leetcode.editor.cn;

import java.util.Arrays;
import java.util.Random;

 class ShuffleAnArray{
    public static void main(String[] args) {
        Solution solution = new ShuffleAnArray().new Solution(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(solution.shuffle()));
        System.out.println(Arrays.toString(solution.reset()));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        private int[] nums;
        public Solution(int[] nums) {
            this.nums = nums;
        }

        public int[] reset() {
            return  nums;
        }

        public int[] shuffle() {
            Random ran = new Random();
            int[] arr = nums.clone();
            int len = nums.length;
            //交换
            for(int i=0;i<arr.length;i++) {
                int j = ran.nextInt(len);  //从0到len-1数组序列中随机找一个和i交换，也满足当前序列每个元素被抽到的概率相同
//                int j = ran.nextInt(i+1); //从0到i数组序列中随机找一个和i交换，也满足当前序列每个元素被抽到概率相同
//                int j = ran.nextInt(len-i)+i; //从i到len-1的数组序列中找一个和i交换，也满足当前序列每个元素被抽到的概率相同
                //交换两个元素
                int tp = arr[i];
                arr[i] = arr[j];
                arr[j] = tp;
            }
            return arr;
        }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
