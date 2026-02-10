class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int maxLen=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            while(hs.contains(s.charAt(i)))
            {
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(s.charAt(i));
            maxLen=Math.max(maxLen,i-j+1);
        }
        return maxLen;
    }
}