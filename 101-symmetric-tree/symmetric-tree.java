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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true; // empty tree is symmetry

        return symmetry(root.left, root.right);
    }

    boolean symmetry(TreeNode l, TreeNode r) {
        if (l == r) return true; //null case (both)
        if(l == null || r == null) return false;
        if(l.val != r.val) return false;

        return symmetry(l.left, r.right) && symmetry(l.right, r.left);
    }
}