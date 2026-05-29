class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp=0;
        int tp=0;
        int cnt=0;
        int idx=0;
        if(s.length()>t.length() ) return false;
        if(s.length()==0) return true;
        for(int i=0;i<t.length();i++)
        {
            if(s.charAt(0)==t.charAt(i)) 
            {
                idx=i;
                break;
            }
        }
        while(sp<s.length() && tp<t.length())
        {
            if((t.charAt(tp)==s.charAt(sp)) && idx<=tp)
            {
                idx=tp;
                cnt++;
                sp++;
            }
            tp++;
            
        }
        if(cnt==s.length()) return true;
        else return false;
    }
}