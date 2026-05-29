class Solution {
    public int minElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sumOfDigits(nums[i]);

        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        return min;

    }
    int sumOfDigits(int x)
    {
        int n=0;
        int sum=0;
        while(x>0)
        {
            n=x%10;
            sum+=n;
            x=x/10;
        }
        return sum;
    }
}