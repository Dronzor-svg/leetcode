class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mpp1=new HashMap<>();
        HashMap<Character,Integer> mpp2=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++)
        {
            mpp1.put(ransomNote.charAt(i),mpp1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++)
        {
            mpp2.put(magazine.charAt(i),mpp2.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(char ch : mpp1.keySet()) {
            if(mpp2.getOrDefault(ch, 0) < mpp1.get(ch)) {
                return false;
            }
        }

        return true;
    }
}