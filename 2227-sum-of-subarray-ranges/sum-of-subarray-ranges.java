class Solution {
    public long subArrayRanges(int[] nums) {
        return subMax(nums) - subMin(nums);
    }

   
    long subMax(int[] nums) {
        int n = nums.length;
        int[] nge = findNGE(nums);
        int[] pge = findPGE(nums);
        long total = 0;

        for (int i = 0; i < n; i++) {
            long left = i - pge[i];
            long right = nge[i] - i;
            total += left * right * nums[i];
        }
        return total;
    }

    int[] findNGE(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nge;
    }

    int[] findPGE(int[] nums) {
        int n = nums.length;
        int[] pge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pge;
    }

    
    long subMin(int[] nums) {
        int n = nums.length;
        int[] nse = findNSE(nums);
        int[] pse = findPSE(nums);
        long total = 0;

        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;
            total += left * right * nums[i];
        }
        return total;
    }

    int[] findNSE(int[] nums) {
        int n = nums.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nse;
    }

    int[] findPSE(int[] nums) {
        int n = nums.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
}
