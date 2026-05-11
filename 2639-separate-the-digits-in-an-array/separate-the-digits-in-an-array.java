class Solution {
    public int[] separateDigits(int[] nums) {
       

        //String str = String.valueOf(n);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++)
        {
            String str=String.valueOf(nums[i]);

            sb.append(str);

        }
        int[] ans=new int[sb.length()];

        for(int i=0;i<sb.length();i++)
        {
            int ch=sb.charAt(i)-'0';
            ans[i]=ch;
        }
        return ans;

    }
    
}