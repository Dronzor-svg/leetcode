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
    public boolean checkTree(TreeNode root) {
        // Queue<TreeNode> q=new LinkedList<>();

        // q.offer(root);
        // int sum=0;
        // while(!q.isEmpty())
        // {
        //     TreeNode node=q.poll();

        //     if(node.left!=null) sum+=node.left.val;
        //     if(node.right!=null) sum+=node.right.val;
        // }
        // if(sum==root.val) return true;
        // else return false;

        return root.val == root.left.val + root.right.val;
    }
}