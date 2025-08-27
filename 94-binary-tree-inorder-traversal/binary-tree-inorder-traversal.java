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
    public List<Integer> inorderTraversal(TreeNode root) {

        // Iterative approach

        Stack<TreeNode> st = new Stack<>();
        List<Integer> res = new ArrayList<>();

        TreeNode node = root;

        while(true) {
            if (node != null) {
                st.push(node);
                node = node.left; // traverse till left end   
            } else {
                if (st.isEmpty()) {
                    break;
                }
                node = st.pop(); // keep the node and travel again
                res.add(node.val);
                node = node.right;
            }
        }
        
        return res;
    }
}