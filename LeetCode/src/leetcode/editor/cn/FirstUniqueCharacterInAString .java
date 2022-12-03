//给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入: s = "leetcode"
//输出: 0
// 
//
// 示例 2: 
//
// 
//输入: s = "loveleetcode"
//输出: 2
// 
//
// 示例 3: 
//
// 
//输入: s = "aabb"
//输出: -1
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 10⁵ 
// s 只包含小写字母 
// 
//
// Related Topics 队列 哈希表 字符串 计数 👍 612 👎 0

 
package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class FirstUniqueCharacterInAString{
    public static void main(String[] args) {
        Solution solution = new FirstUniqueCharacterInAString().new Solution();
        
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
        String[] strs = s.split("");
        HashMap<String,Integer> hash = new HashMap<>();
        for (String str : strs) {
            //存在就加一，不存在就为1
            if (hash.get(str) == null) {
                hash.put(str,1);
            } else {
                hash.put(str,hash.get(str)+1);
            }
        }
        //遍历哈希表，遇到值为1的输出
        for (int i=0;i<strs.length;i++) {
            if (hash.get(strs[i])==1) {
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
