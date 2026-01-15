class Solution {
    public int maxPower(String s) {
        char[] c=s.toCharArray();
        int length=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        int count=0;
        while(left<=right && right<c.length)
        {
            if(c[left]==c[right])
            {
                count++;
                right++;
            }
            else
            {
                count=0;
                left++;
            } 
            length=Math.max(length,count);
        }
        return length;
    }
}