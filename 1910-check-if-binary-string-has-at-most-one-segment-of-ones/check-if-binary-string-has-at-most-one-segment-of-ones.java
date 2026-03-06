class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                for(int j=i;j>=0;j--)
                {
                    if(s.charAt(j)=='0') return false;
                }
            }
        }
        return true;
    }
}