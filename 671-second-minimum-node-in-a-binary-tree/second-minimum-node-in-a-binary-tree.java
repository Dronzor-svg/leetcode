class Solution {

    long min = Long.MAX_VALUE;
    long smin = Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {

        helper(root);

        return smin == Long.MAX_VALUE ? -1 : (int)smin;
    }

    void helper(TreeNode root) {

        if (root == null) return;

        if (root.val < min) {
            smin = min;
            min = root.val;
        }
        else if (root.val > min && root.val < smin) {
            smin = root.val;
        }

        helper(root.left);
        helper(root.right);
    }
}