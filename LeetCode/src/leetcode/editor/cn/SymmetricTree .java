//给你一个二叉树的根节点 root ， 检查它是否轴对称。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,2,2,3,4,4,3]
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：root = [1,2,2,null,3,null,3]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [1, 1000] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：你可以运用递归和迭代两种方法解决这个问题吗？ 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 2155 👎 0

 
package leetcode.editor.cn;

 class SymmetricTree {
     public static void main(String[] args) {
         Solution solution = new SymmetricTree().new Solution();

     }


     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode() {
         }

         TreeNode(int val) {
             this.val = val;
         }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
     //leetcode submit region begin(Prohibit modification and deletion)
     class Solution {
         public boolean isSymmetric(TreeNode root) {
             if (root == null) {
                 return true;
             }
             //对左子树和右子树进行判断
             return isSymmetricSolve(root.left, root.right);
         }

         public boolean isSymmetricSolve(TreeNode left, TreeNode right) {
             //左右结点为null，该节点为叶子结点，返回true
             if (left == null && right == null) {
                 return true;
             }
             //如果当前节点只有一个子节点或者有两个子节点，但两个子节点的值不相同，直接返回false（对于第二层和后面调用都适用，第二层是特殊的，而从第三层开始，由于调用方式改变，所以也适用）
             if (left == null || right == null || left.val != right.val) {
                 return false;
             }
             //对于第三层新的调用方法，左结点的左子节点和右结点的右子节点值相同，左节点的右子节点和右结点的左子节点值相同
             return isSymmetricSolve(left.left, right.right) && isSymmetricSolve(left.right, right.left);

         }
     }
     //leetcode submit region end(Prohibit modification and deletion)
 }
