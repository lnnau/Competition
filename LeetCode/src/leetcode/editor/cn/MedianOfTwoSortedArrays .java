//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
//
// Related Topics 数组 二分查找 分治 👍 6058 👎 0


package leetcode.editor.cn;

class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
        solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            double[] arr = new double[m + n];
            //两数组索引
            int p = 0;
            int q = 0;
            //合并两数组
            for (int i = 0; i < m + n; i++) {
                //两数组都没有合并完
                if (q < n && p < m) {
                    if (nums1[p] < nums2[q]) {
                        arr[i] = nums1[p];
                        p++;
                    } else {
                        arr[i] = nums2[q];
                        q++;
                    }
                    continue;
                }
                //合并nums2剩余部分，p>=m表示nums1合并结束
                if (p >= m && q < n) {
                    arr[i] = nums2[q];
                    q++;
                }
                if (q >= n && p < m) {
                    arr[i] = nums1[p];
                    p++;
                }
            }
            if ((n + m) % 2 == 1) {
                return arr[(m + n) / 2];
            } else {
                return (arr[(m + n) / 2] + arr[(m + n) / 2 - 1])/2;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
