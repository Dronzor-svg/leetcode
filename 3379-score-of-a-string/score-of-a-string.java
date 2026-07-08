class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++)
        {
            int ch1=s.charAt(i-1)-'0';
            int ch2=s.charAt(i)-'0';

            sum=sum+(Math.abs(ch1-ch2));

        }
        return sum;
    }
}