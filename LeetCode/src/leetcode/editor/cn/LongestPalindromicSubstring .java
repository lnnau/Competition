//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
//
// Related Topics 字符串 动态规划 👍 5921 👎 0

 
package leetcode.editor.cn;

class LongestPalindromicSubstring{
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
        solution.longestPalindrome("babad");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len<2) {
            return s;
        }
        String rStr = "";
        int num = 0;
        for (int i=0; i<len; i++) {
            //起始值从i+num-1后开始，因为比num是当前最大的回文子串，比num长度小的不必重复计算了
            for (int j=i+num-1; j<len; j++) {
                //求子串
                String str = s.substring(i, j + 1);
                if (isPalindromic(str) && str.length()>num) {
                    rStr = str;
                    num = str.length();
                }
            }
        }
        return rStr;
    }
        public boolean isPalindromic(String s) {
            int len = s.length();
            for (int i = 0; i < len / 2; i++) {
                if (s.charAt(i) != s.charAt(len - i - 1)) {
                    return false;
                }
            }
            return true;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}
