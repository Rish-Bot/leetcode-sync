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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        boolean r2l = false;

        while (!q.isEmpty()) {
            int sz = q.size();
            Deque<Integer> lvl = new ArrayDeque<>();

            for (int i = 0; i < sz; i++) {
                TreeNode node = q.poll();

                if (r2l)
                    lvl.addFirst(node.val);
                else
                    lvl.addLast(node.val);

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }

            ans.add(new ArrayList<>(lvl));
            r2l = !r2l;
        }
        return ans;
    }
}