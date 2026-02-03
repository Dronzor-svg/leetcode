class Solution {
    public boolean isTrionic(int[] nums) {
        int cnt=1;
        int temp=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1]) cnt++;
            else break;
        }
        if(cnt==1) return false;
        
        else
        {
            temp=cnt;
            for(int i=cnt;i<nums.length;i++)
            {
                if(nums[i]<nums[i-1]) cnt++;
                else break;
            }
        }
        if(cnt==temp) return false;
        else
        {
            temp=cnt;
            for(int i=cnt;i<nums.length;i++)
            {
                if(nums[i]>nums[i-1]) cnt++;
                else break;
            }
        }
        if(temp==cnt) return false;
        return cnt==nums.length;

    }
}