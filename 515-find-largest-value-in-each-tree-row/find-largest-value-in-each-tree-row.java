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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;

        q.offer(root);

        while(!q.isEmpty())
        {
            int max=Integer.MIN_VALUE;

            int level=q.size();

            for(int i=0;i<level;i++)
            {
                if(q.peek().left!=null)
                {
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null)
                {
                    q.offer(q.peek().right);
                }
                max=Math.max(q.poll().val,max);
            }

            list.add(max);
        }
        return list;
    }
}