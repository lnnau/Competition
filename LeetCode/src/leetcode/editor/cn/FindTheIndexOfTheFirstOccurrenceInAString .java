//给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
//如果 needle 不是 haystack 的一部分，则返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入：haystack = "sadbutsad", needle = "sad"
//输出：0
//解释："sad" 在下标 0 和 6 处匹配。
//第一个匹配项的下标是 0 ，所以返回 0 。
// 
//
// 示例 2： 
//
// 
//输入：haystack = "leetcode", needle = "leeto"
//输出：-1
//解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= haystack.length, needle.length <= 10⁴ 
// haystack 和 needle 仅由小写英文字符组成 
// 
//
// Related Topics 双指针 字符串 字符串匹配 👍 1617 👎 0

 
package leetcode.editor.cn;

class FindTheIndexOfTheFirstOccurrenceInAString{
    public static void main(String[] args) {
        Solution solution = new FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
        System.out.println(solution.strStr("a","a"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        //kmp算法
        char[] t = haystack.toCharArray();
        char[] s = needle.toCharArray();
        int p = 0,len1 = t.length,len2 = s.length;
        //主串没有寻找一遍,防止数组越界
        while (p<len1 && p+len2<=len1) {
            //找到第一个匹配的元素
            if (t[p]==s[0]) {
                int count = 1; //计数器，统计匹配次数，初始为1，第一个已经匹配了
                //遍历s后续元素是否也匹配，故下标从1开始
                for (int i=1;i<len2;i++) {
                    if (t[p+i]==s[i]) {
                        count++;
                    }
                }
                //判断是否完全匹配
                if (count==len2) {
                    return p;
                }
            }
            //主串指针后移1位
            p++;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
