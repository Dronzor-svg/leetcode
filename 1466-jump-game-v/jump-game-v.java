class Solution {
    int[] dp;
    int n;

    public int maxJumps(int[] arr, int d) {
        n = arr.length;
        dp = new int[n];

        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(arr, d, i));
        }

        return ans;
    }

    private int dfs(int[] arr, int d, int i) {

        if (dp[i] != 0)
            return dp[i];

        int best = 1;

        // move right
        for (int j = i + 1; j <= Math.min(n - 1, i + d); j++) {

            if (arr[j] >= arr[i])
                break;

            best = Math.max(best, 1 + dfs(arr, d, j));
        }

        // move left
        for (int j = i - 1; j >= Math.max(0, i - d); j--) {

            if (arr[j] >= arr[i])
                break;

            best = Math.max(best, 1 + dfs(arr, d, j));
        }

        return dp[i] = best;
    }
}