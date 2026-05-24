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
    public TreeNode reverseOddLevels(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        int cnt = 0;
        if (root == null)
            return root;
        q.offer(root);

        while (!q.isEmpty()) {
            int level = q.size();
            ArrayList<TreeNode> list = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                list.add(q.poll());
                
            }
            
            if(cnt%2!=0)
            {
                int l=0;
                int r=list.size()-1;
                while(l<r)
                {
                    int temp=list.get(l).val;
                    list.get(l).val=list.get(r).val;
                    list.get(r).val=temp;
                    l++;
                    r--;
                }
            }
            cnt++;
        }
        return root;
    }
}