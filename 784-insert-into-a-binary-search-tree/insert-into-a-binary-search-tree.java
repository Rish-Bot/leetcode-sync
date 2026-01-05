/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return sol(root, val);
    }

    TreeNode sol(TreeNode node, int val) {
        if(node == null)
            return new TreeNode(val); //it adds the val back 

        if(node.val > val) {
            node.left = sol(node.left, val); //alter left portion
        } else {
            node.right = sol(node.right, val); //alter right portion
        }

        return node;
    }
}