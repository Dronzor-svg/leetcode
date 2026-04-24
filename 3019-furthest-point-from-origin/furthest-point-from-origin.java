class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cntL=0;
        int cntR=0;
        int cnt=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch==('L')) cntL++;
            else if(ch=='R') cntR++;
        }
        if(cntL>cntR)
        {
            for(int i=0;i<moves.length();i++)
            {
                char ch=moves.charAt(i);
                if(ch=='L') cnt++;
                else if(ch=='R') cnt--;
                if(ch=='_') cnt++;
            }
        }
        else
        {
            for(int i=0;i<moves.length();i++)
            {
                char ch=moves.charAt(i);
                if(ch=='L') cnt--;
                else if(ch=='R') cnt++;
                if(ch=='_') cnt++;
            }
        }
        return cnt;
    }
}