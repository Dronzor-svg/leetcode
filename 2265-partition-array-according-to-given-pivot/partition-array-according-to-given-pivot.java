class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        for(int x : nums)
        {
            if(x<pivot)
            {
                ans[i]=x;
                i++;
            }
        }
        
        for(int x : nums)
        {
            if(x==pivot)
            {
                ans[i++]=x;
                
            }
        }
        for(int x : nums)
        {
            if(x>pivot)
            {
                ans[i++]=x;
                
            }
        }
        return ans;
    }
}