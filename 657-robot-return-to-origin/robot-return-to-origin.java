class Solution {
    public boolean judgeCircle(String moves) {
        int cntu=0;
        int cntl=0;
        int cntd=0;
        int cntr=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='U') cntu++;
            if(ch=='L') cntl++;
            if(ch=='R') cntr++;
            if(ch=='D') cntd++;
        }
        if(cntu-cntd==0 && cntr-cntl==0) return true;
        else return false;
    }
}