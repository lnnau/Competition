//给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[9,20],[15,7]]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：[[1]]
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 2000] 内 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics 树 广度优先搜索 二叉树 👍 1484 👎 0

 
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinaryTreeLevelOrderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
//        TreeNode root = new TreeNode(1,new TreeNode(2,null,null),null);
//        solution.levelOrder(root);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

public  class TreeNode {
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

    /**
     * 每层的结点个数为2^(n-1) n为层数
     * 通过遍历每层把结点数加入 为null不加入
     *                      每层的结点数为限制条件
     */
    class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> aList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();     //利用队列先进先出，形成从上到下，从左到右的结点顺序
        //空结点直接返回
        if (root == null) {
            return aList;
        }
        //根结点入队
        queue.add(root);
        //当结点没有被遍历完时，即队列非空
        while (!queue.isEmpty()) {
            //记录该层结点数
            int levelNum = queue.size();
            //记录每层结点值
            List<Integer> bList = new ArrayList<>();
            //遍历该层结点
            for (int i = 0; i < levelNum; i++) {
                //从左往右取出结点
                TreeNode node = queue.poll();
                //把结点值加入集合
                bList.add(node.val);
                //左结点不为null，就加入队列
                if (node.left != null) {
                    queue.add(node.left);
                }
                //右结点不为null加入队列
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            //把每层的结点值存到集合
            aList.add(bList);
        }
        return aList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
