//如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。 
//
// 字母和数字都属于字母数字字符。 
//
// 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入: s = "A man, a plan, a canal: Panama"
//输出：true
//解释："amanaplanacanalpanama" 是回文串。
// 
//
// 示例 2： 
//
// 
//输入：s = "race a car"
//输出：false
//解释："raceacar" 不是回文串。
// 
//
// 示例 3： 
//
// 
//输入：s = " "
//输出：true
//解释：在移除非字母数字字符之后，s 是一个空字符串 "" 。
//由于空字符串正着反着读都一样，所以是回文串。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// s 仅由可打印的 ASCII 字符组成 
// 
//
// Related Topics 双指针 字符串 👍 588 👎 0

 
package leetcode.editor.cn;

import java.util.Arrays;

class ValidPalindrome{
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();
        System.out.println(solution.isPalindrome("Zeus was deified, saw Suez."));;
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        String res = "";
        //去除非字母数字字符
        for (int i=0;i<chars.length;i++) {
            if ((chars[i]>=48 && chars[i]<=57) || (chars[i]>=65 && chars[i]<=90) ||
            chars[i]>=97&&chars[i]<=122) {
                res += chars[i];
            }
        }
        //大写转小写
        res = res.toLowerCase();
        //判断是否是回文串
        StringBuffer sb1 = new StringBuffer(res).reverse();
        String sb = sb1.toString();
        if (res.equals(sb)) {
            return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
