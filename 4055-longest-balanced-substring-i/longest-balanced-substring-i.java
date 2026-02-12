class Solution {
    public int longestBalanced(String s) {
        int result=Integer.MIN_VALUE;
        
        for(int i=0;i<s.length();i++)
        {
            int[] freq=new int[26];
            int maxfreq=0;
            int dist=0;
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                int idx=ch-'a';
                if(freq[idx]==0)
                {
                    dist++;
                }
                freq[idx]+=1;
                maxfreq=Math.max(maxfreq,freq[idx]);
                if(maxfreq*dist==j-i+1)
                {
                   result=Math.max(result ,j-i+1);
                }
            }
        }
        return result;
    }
}