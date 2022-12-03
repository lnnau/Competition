//给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != 
//k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请 
//
// 你返回所有和为 0 且不重复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//解释：
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
//不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
//注意，输出的顺序和三元组的顺序并不重要。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1,1]
//输出：[]
//解释：唯一可能的三元组和不为 0 。
// 
//
// 示例 3： 
//
// 
//输入：nums = [0,0,0]
//输出：[[0,0,0]]
//解释：唯一可能的三元组和为 0 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 3000 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// Related Topics 数组 双指针 排序 👍 5379 👎 0

 
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum{
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        solution.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        //先对数组排序，便于使用双指针和去重
        Arrays.sort(nums);
        //结果集
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0; i<len-2; i++) {
            //过滤起始重复的
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            //如果第一个值大于0，那么后面的也大于0，则必然无法组成三元组
            if (nums[i] > 0) {
                break;
            }
            //定义前后指针，通过一层循环找出符合的三元组
            int p = i+1;
            int q = len-1;
            int target = -nums[i];  //便于比较
            while (p<q) {
                int sum = nums[p] + nums[q];
                if (target == sum) {
                    List<Integer> tp = new ArrayList<>();
                    tp.add(nums[i]);
                    tp.add(nums[p]);
                    tp.add(nums[q]);
                    //添加到结果
                    list.add(tp);
                    //过滤左指针的重复元素
                    while (p < q && nums[p] == nums[p+1]) {
                        p++;
                    }
                    while (p < q && nums[q] == nums[q-1]) {
                        q--;
                    }
                    p++;
                    q--;
                } else if(sum > target) {
                    //大于，右指针左移
                    q--;
                } else {
                    //小于，左指针右移
                    p++;
                }
            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
