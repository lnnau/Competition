//给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。 
//
// 有效 二叉搜索树定义如下： 
//
// 
// 节点的左子树只包含 小于 当前节点的数。 
// 节点的右子树只包含 大于 当前节点的数。 
// 所有左子树和右子树自身必须也是二叉搜索树。 
// 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [2,1,3]
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：root = [5,1,4,null,null,3,6]
//输出：false
//解释：根节点的值是 5 ，但是右子节点的值是 4 。
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目范围在[1, 10⁴] 内 
// -2³¹ <= Node.val <= 2³¹ - 1 
// 
//
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 👍 1780 👎 0

 
package leetcode.editor.cn;

class ValidateBinarySearchTree{
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();

    }
    //leetcode submit region begin(Prohibit modification and deletion)
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
class Solution {
    public boolean isValidBST(TreeNode root) {
        //最大值和最小值要用Long的常量，因为结点的值可以为int的常量值
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    //添加附带范围的方法，避免出现范围错误
    public boolean isValidBST(TreeNode root,long min,long max) {
        //递归出口 当前结点为null，或者只有一个结点都返回true
        if (root == null) {
            return true;
        }
        //超出范围返回false
        if (root.val >= max || root.val <= min) {
            return false;
        }
        //左子树最小值为min 最大值为根结点的值，
        return isValidBST(root.left,min,root.val) && isValidBST(root.right,root.val,max);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
