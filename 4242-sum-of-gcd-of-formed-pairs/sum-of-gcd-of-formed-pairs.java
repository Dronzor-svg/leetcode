class Solution {
    public long gcdSum(int[] nums) {
        int mx=0;

        int[] prefixGcd=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            mx=Math.max(mx,nums[i]);

            prefixGcd[i]=gcd(nums[i],mx);
        }

        Arrays.sort(prefixGcd);

        int left=0;
        int right=prefixGcd.length-1;
        long ans=0;
        while(left<right)
        {
            ans+=gcd(prefixGcd[left],prefixGcd[right]);

            left++;
            right--;
        }
        return ans;
    }

    int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }

}