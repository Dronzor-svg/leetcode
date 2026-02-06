class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=0;
        int left=0;
        for(int i=0;i<n;i++)
        {
            while(nums[i]>(long)k*nums[left]) left++;
            a=Math.max(a,i-left+1);
        }
        return n-a;
    }
}