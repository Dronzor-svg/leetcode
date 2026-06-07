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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<descriptions.length;i++)
        {
            mpp.put(descriptions[i][1],mpp.getOrDefault(descriptions[i][1],0)+1);
        }

        HashMap<Integer,TreeNode> tree=new HashMap<>();
        for(int[] d : descriptions) {
            int parent = d[0];
            int child = d[1];
            tree.putIfAbsent(parent, new TreeNode(parent));
            tree.putIfAbsent(child, new TreeNode(child));
        }

        for(int[] d : descriptions)
        {
            int parent = d[0];
            int child = d[1];
            int isLeft = d[2];
            TreeNode p = tree.get(parent);
            TreeNode c = tree.get(child);
            if(isLeft == 1) p.left = c;
            else p.right = c;
        }
        for(int[] d : descriptions)
        {
            if(!mpp.containsKey(d[0]))
            return tree.get(d[0]);
        }
        return null; 
    }
}