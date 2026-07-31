class Solution {
    public int minimumPushes(String word) {
        
        if(word.length()<=8)
        {
            return word.length();
        }

        HashMap<Character,Integer> mpp=new HashMap<>();

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mpp.entrySet());

        
        list.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());

        int idx=0;
        int a=0;
        int ans=0;
        for (Map.Entry<Character, Integer> entry : list)
        {

            if(idx%8==0)
            {
                a=a+1;
            }

            ans+=entry.getValue()*a;

            idx++;
            
        }
        return ans;
    }
}