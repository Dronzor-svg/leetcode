class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> mpp=new HashMap<>();

        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);

            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        int cntb=0;
        int cnta=0;
        int cntl=0;
        int cnto=0;
        int cntn=0;
        if(mpp.containsKey('b'))
        {
            cntb=mpp.get('b');
        }
        if(mpp.containsKey('a'))
        {
            cnta=mpp.get('a');
        }
        if(mpp.containsKey('l')) cntl=mpp.get('l');
        if(mpp.containsKey('o')) cnto=mpp.get('o');
        if(mpp.containsKey('n')) cntn=mpp.get('n');

        int freqo=cnto/2;
        int freql=cntl/2;

        int ans=0;
        ans=Math.min(cntb,Math.min(cnta,Math.min(freql,Math.min(freqo,cntn))));


        return ans;

    }
}