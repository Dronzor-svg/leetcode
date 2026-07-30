class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8) return word.length();

        int ans=8;
        int a=1;
        for(int i=8;i<word.length();i++)
        {
            if(i%8==0) a+=1;

            ans+=a;
        }

        return ans;
    }
}