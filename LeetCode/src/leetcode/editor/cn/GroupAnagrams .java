//给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。 
//
// 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。 
//
// 
//
// 示例 1: 
//
// 
//输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出: [["bat"],["nat","tan"],["ate","eat","tea"]] 
//
// 示例 2: 
//
// 
//输入: strs = [""]
//输出: [[""]]
// 
//
// 示例 3: 
//
// 
//输入: strs = ["a"]
//输出: [["a"]] 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 10⁴ 
// 0 <= strs[i].length <= 100 
// strs[i] 仅包含小写字母 
// 
//
// Related Topics 数组 哈希表 字符串 排序 👍 1316 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new GroupAnagrams().new Solution();
        solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            if (strs==null || strs.length==0) {
                return new ArrayList<>();
            }
            HashMap<String,List<String>> map = new HashMap<>();
            //遍历字符串
            for (String str : strs) {
                char[] chars = str.toCharArray();
                //对字符串进行排序，字母异位词排序后相同
                Arrays.sort(chars);
                //将排序后的字符作为key值
                String key = String.valueOf(chars);
                //若key不存在，创建列表值
                if (!map.containsKey(key)) {
                    map.put(key,new ArrayList<>());
                }
                //将未排序的字符串添加到value中,因为值是列表可以add
                map.get(key).add(str);
            }
            return new ArrayList<>(map.values());















           /* List<List<String>> rlist = new ArrayList<>();
            HashMap<String, String> map = new HashMap<>();   //记录该字符是否已经添加集合
            int len = strs.length;
            for (int i = 0; i < len; i++) {
                //集合不包含该元素
                if (!map.containsKey(strs[i])) {
                    List<String> list = new ArrayList<>();
                    char[] chars1 = strs[i].toCharArray();
                    char[] ch1 = new char[123];
                    //添加起始元素
                    list.add(strs[i]);
                    map.put(strs[i], strs[i]);
                    for (char aChar : chars1) {
                        //对应ascii值加一
                        ch1[aChar]++;
                    }
                    //从头到位遍历判断是否存在相同字母组成的元素
                    for (int j = 0; j < len && j != i; j++) {
                        char[] chars2 = strs[j].toCharArray();
                        char[] ch2 = new char[123];
                        for (char aChar : chars2) {
                            ch2[aChar]++;
                        }
                        //遍历ch1和ch2，判断对应字符是否一致
                        for (int x = 97; x < 123; x++) {
                            if (ch1[x] != ch2[x]) {
                                break;
                            }
                        }
                        //相等就添加到集合
                        list.add(strs[j]);
                        map.put(strs[j], strs[j]);
                       if (j==len-1) {
                           //添加到结果集
                           rlist.add(list);
                       }
                    }

                }
            }
            return rlist;*/
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
