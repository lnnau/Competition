//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// Related Topics 数学 👍 3658 👎 0

 
package leetcode.editor.cn;

class ReverseInteger{
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
        System.out.println(solution.reverse(-2147483648));

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x!=0) {
            res = res*10 + x%10;
            x /= 10;
        }
        return res == (int)res ? (int)res : 0;
        //繁琐
/*        if (x>=0) {
            StringBuffer sb = new StringBuffer(""+x);
            Long res = Long.parseLong(sb.reverse().toString());
            return res > 2147483647 ? 0 : res.intValue();
        } else {
            String str = (""+x).substring(1);
            StringBuffer sb = new StringBuffer(str);
            Long res = Long.parseLong("-"+sb.reverse());
            return res < -2147483648 ? 0 : res.intValue();
        }*/
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
