class Solution {
    public int maxDistance(int[] colors) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=colors.length-1;
        for(int i=1;i<colors.length;i++)
        {
            if(colors[i]!=colors[colors.length-1])
            {
                left=i;
                break;
            }
        }
        for(int i=colors.length-1;i>=0;i--)
        {
            if(colors[i]!=colors[0])
            {
                right=i;
                break;
            }
        }
        return Math.max(colors.length-1-left,right);
        
    }
}