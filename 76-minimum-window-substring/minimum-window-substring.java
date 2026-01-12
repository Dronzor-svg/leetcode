class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> mpp=new HashMap<>();
        int minLen=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        int cnt=0;
        int sIndex=-1;
        for(int i=0;i<t.length();i++)
        {
            mpp.put(t.charAt(i),mpp.getOrDefault(t.charAt(i),0)+1);
        }
        while(r<s.length())
        {
            if(mpp.getOrDefault(s.charAt(r),0)>0) cnt=cnt+1;
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0) - 1);

            while(cnt==t.length())
            {
                if(r-l+1<minLen)
                {
                    minLen=r-l+1;
                    sIndex=l;
                }
                mpp.put(s.charAt(l),mpp.getOrDefault(s.charAt(l),0)+1);

                if(mpp.getOrDefault(s.charAt(l),0)>0) cnt=cnt-1;
                l++;
            }
            r=r+1;
        }
        return sIndex==-1 ? "" : s.substring(sIndex,sIndex+minLen);
    }
}