class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        int cnt=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);

            if(Character.isLowerCase(ch) )
            {
                mpp.put(ch,i);
            }
            if(Character.isUpperCase(ch) && !mpp.containsKey(ch))
            {
                mpp.put(ch,i);
            }

            
        }
        for(char ch='a';ch<='z';ch++)
        {
            char upper=Character.toUpperCase(ch);
            if(mpp.containsKey(ch) && mpp.containsKey(upper))
            {
                if(mpp.get(upper)>mpp.get(ch)) cnt++;
            }
        }
        return cnt;
    }
}


// if((Character.isLowerCase(ch) && mpp.containsKey(Character.toUpperCase(ch))) || (Character.isUpperCase(ch) && mpp.containsKey(Character.toLowerCase(ch))))
            // {
            //     if(Character.isLowerCase(ch))
            //     {
            //         int idx=mpp.get(Character.toUpperCase(ch));
            //         if(idx>i) cnt++;
            //     }
            //     else
            //     {
            //         int idx=mpp.get(Character.toLowerCase(ch));
            //         if(idx<i) cnt++;
            //     }

            // }