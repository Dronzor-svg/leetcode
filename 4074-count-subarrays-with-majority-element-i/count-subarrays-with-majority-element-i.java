class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int cnt=0;
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=i;j<nums.length;j++)
            {
                list.add(nums[j]);
                if(nums[j]==target)
                {
                    cnt++;
                }
                if((2*cnt)>list.size())
                {
                    ans++;
                }
                
                else
                {
                    if((2*cnt)>list.size())
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}