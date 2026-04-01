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
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum=0;

        // Queue<TreeNode> q=new LinkedList<>();
        // q.offer(root);

        // while(!q.isEmpty())
        // {
        //     TreeNode node=q.poll();

        //     if(node.val>=low && node.val<=high) sum+=node.val;

        //     if(node.left!=null) q.offer(node.left);
        //     if(node.right!=null) q.offer(node.right);

        // }
        // return sum;
        if (root == null) return 0; // base case.
        if (root.val < L) return rangeSumBST(root.right, L, R); // left branch excluded.
        if (root.val > R) return rangeSumBST(root.left, L, R); // right branch excluded.
        return root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
    }
}