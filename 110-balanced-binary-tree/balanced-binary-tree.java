
class Pair {
    boolean first;
    int second;

    Pair(boolean first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    public boolean isBalanced(TreeNode root) {
        return isBalancedFast(root).first;
    }

    public Pair isBalancedFast(TreeNode root) {
        if (root == null) {
            return new Pair(true, 0);
        }

        Pair left = isBalancedFast(root.left);
        Pair right = isBalancedFast(root.right);

        boolean leftAns = left.first;
        boolean rightAns = right.first;

        boolean diff = Math.abs(left.second - right.second) <= 1;

        int height = Math.max(left.second, right.second) + 1;

        boolean isBalanced = leftAns && rightAns && diff;

        return new Pair(isBalanced, height);
    }
}