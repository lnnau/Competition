//给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。 
//
// 
// 
//
// 
//
// 示例 1： 
// 
// 
//输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
//输出：[[1,0,1],[0,0,0],[1,0,1]]
// 
//
// 示例 2： 
// 
// 
//输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[0].length 
// 1 <= m, n <= 200 
// -2³¹ <= matrix[i][j] <= 2³¹ - 1 
// 
//
// 
//
// 进阶： 
//
// 
// 一个直观的解决方案是使用 O(mn) 的额外空间，但这并不是一个好的解决方案。 
// 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。 
// 你能想出一个仅使用常量空间的解决方案吗？ 
// 
//
// Related Topics 数组 哈希表 矩阵 👍 800 👎 0

 
package leetcode.editor.cn;

import java.util.Arrays;

class SetMatrixZeroes{
    public static void main(String[] args) {
        Solution solution = new SetMatrixZeroes().new Solution();
//        solution.setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
        solution.setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void setZeroes(int[][] matrix) {
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        //标志数组,默认为0标志未经过置0操作
        int[][] flag = new int[len1][len2];
        for (int i=0; i<len1; i++) {
            for (int j=0; j<len2; j++) {
                //标记原始数组0出现位置
                if (matrix[i][j] == 0) {
                    flag[i][j] = 1;
                }
            }
        }
        //遍历数组，对标记处的行列进行置零
        for (int i=0; i<len1; i++) {
            for (int j=0; j<len2; j++) {
                if (flag[i][j] == 1) {
                    //将i行和j列置为0
                    for (int y=0; y<len2; y++) {
                        matrix[i][y] = 0;
                    }
                    for (int x=0; x<len1; x++) {
                        matrix[x][j] = 0;
                    }
                }
            }
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
