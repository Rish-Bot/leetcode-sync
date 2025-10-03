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
    private int depth = 0;
    public int maxDepth(TreeNode root) {
        int curr = 1;
        dfs(root, curr);
        return depth;
        
    }

    private void dfs(TreeNode node, int curr) {
        if (node == null) return;

        depth = Math.max(depth, curr);
        dfs(node.left, curr+1);
        dfs(node.right, curr+1);

    }
}