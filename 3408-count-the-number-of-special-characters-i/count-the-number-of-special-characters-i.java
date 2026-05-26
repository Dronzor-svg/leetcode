class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        int cnt=0;
        for(int i=0;i<word.length();i++)
        {
            set.add(word.charAt(i));
        }

        for(char ch : set)
        {
            if(Character.isUpperCase(ch) && set.contains(Character.toLowerCase(ch))) cnt++;
        }
        return cnt;
    }
}