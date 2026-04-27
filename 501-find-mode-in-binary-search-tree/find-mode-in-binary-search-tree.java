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
    public int[] findMode(TreeNode root) {
        
        HashMap<Integer,Integer> mpp=new HashMap<>();
        helper(root,mpp);

        int maxFreq=0;

        for(int freq : mpp.values())
        {
            maxFreq = Math.max(maxFreq, freq);
        }
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int key : mpp.keySet()){
            if(mpp.get(key) == maxFreq){
                list.add(key);
            }
        }

        int[] ans = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
    void helper(TreeNode root, HashMap<Integer,Integer> mpp)
    {
        if(root==null) return;
        mpp.put(root.val,mpp.getOrDefault(root.val,0)+1);
        helper(root.left,mpp);
        helper(root.right,mpp);
    }
}