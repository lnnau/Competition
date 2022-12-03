//请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。 
//
// 
// 数字 1-9 在每一行只能出现一次。 
// 数字 1-9 在每一列只能出现一次。 
// 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图） 
// 
//
// 
//
// 注意： 
//
// 
// 一个有效的数独（部分已被填充）不一定是可解的。 
// 只需要根据以上规则，验证已经填入的数字是否有效即可。 
// 空白格用 '.' 表示。 
// 
//
// 
//
// 示例 1： 
// 
// 
//输入：board = 
//[["5","3",".",".","7",".",".",".","."]
//,["6",".",".","1","9","5",".",".","."]
//,[".","9","8",".",".",".",".","6","."]
//,["8",".",".",".","6",".",".",".","3"]
//,["4",".",".","8",".","3",".",".","1"]
//,["7",".",".",".","2",".",".",".","6"]
//,[".","6",".",".",".",".","2","8","."]
//,[".",".",".","4","1","9",".",".","5"]
//,[".",".",".",".","8",".",".","7","9"]]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：board = 
//[["8","3",".",".","7",".",".",".","."]
//,["6",".",".","1","9","5",".",".","."]
//,[".","9","8",".",".",".",".","6","."]
//,["8",".",".",".","6",".",".",".","3"]
//,["4",".",".","8",".","3",".",".","1"]
//,["7",".",".",".","2",".",".",".","6"]
//,[".","6",".",".",".",".","2","8","."]
//,[".",".",".","4","1","9",".",".","5"]
//,[".",".",".",".","8",".",".","7","9"]]
//输出：false
//解释：除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。 但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无
//效的。 
//
// 
//
// 提示： 
//
// 
// board.length == 9 
// board[i].length == 9 
// board[i][j] 是一位数字（1-9）或者 '.' 
// 
//
// Related Topics 数组 哈希表 矩阵 👍 977 👎 0

 
package leetcode.editor.cn;
 class ValidSudoku{
    public static void main(String[] args) {
        Solution solution = new ValidSudoku().new Solution();
        char ch = 46;
        System.out.println(ch);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValidSudoku(char[][] board) {
        //遍历每列
        for (int i=0; i<9; i++) {
            int[] res1 = new int[10];
            int[] res2 = new int[10];
            for (int j=0; j<9; j++) {
                //把每列的值添加到数组 46的ascii是. -48是让字符对应的ascii码从49起始转换为从1起始
                if (board[i][j] != 46) {
                    res1[board[i][j]-48]++ ;    //i不变，j从0到8，遍历行
                }
                //添加每行
                if (board[j][i] != 46) {
                    res2[board[j][i]-48]++ ;    //i不变，j从0到8，遍历列
                }
            }
            //对i行i列是否符合进行判断,不符合就返回结果
            if (!helper(res1) || !helper(res2)) {
                return false;
            }
        }
        //对3*3方格判断
        for (int i=0; i<9; i+=3) {
            for (int j=0; j<9; j+=3) {
                int[] res3 = new int[10];
                //遍历每个小方格
                for (int p = i; p<i+3;p++) {
                    for (int q=j; q<j+3; q++) {
                        if (board[p][q]!=46) {
                            res3[board[p][q]-48]++ ;
                        }
                    }
                }
                if (!helper(res3)) {
                    return false;
                }
            }
        }
        return true;
    }
    //判断结果集是否出现重复数字
    public boolean helper(int[] res) {
        for (int i=0; i<res.length; i++) {
            if (res[i] > 1) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
