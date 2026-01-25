class Solution {
    public int minimumDifference(int[] nums, int k) {
        int l=0;
        int r=k-1;
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        
        if(k==1) return 0;
        while(r<nums.length)
        {
            min=Math.min(min,nums[r]-nums[l]);
            l++;
            r++;
        }
        return min;
    }
}