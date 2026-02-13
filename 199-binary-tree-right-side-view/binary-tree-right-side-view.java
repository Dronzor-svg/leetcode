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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int s;
        while(!q.isEmpty())
        {
            s=q.size();
            for(int i=0;i<s;i++)
            {
                TreeNode curr=q.poll();
                if(i==s-1)
                {
                    list.add(curr.val);
                }
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
        }
        return list;
    }
}