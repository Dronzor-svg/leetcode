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
    public int sumNumbers(TreeNode root) {
        return sumPath(root,0);
    }
    static int sumPath(TreeNode root,int val)
    {
        if(root==null) return 0;
        val=val*10+root.val;
        if(root.left==null && root.right==null) return val;
        return sumPath(root.left,val)+sumPath(root.right,val);
    }
    
}