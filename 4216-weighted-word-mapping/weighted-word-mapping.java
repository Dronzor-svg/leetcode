class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder sb=new StringBuilder();
        char[] arr = new char[26];

        for (int i = 0; i < 26; i++) 
        {
            arr[i] = (char)('z' - i);
        }
        
        for(int i=0;i<words.length;i++)
        {
            int weight=0;
            for(int j=0;j<words[i].length();j++)
            {
                char ch=words[i].charAt(j);
                weight+=weights[ch-'a'];
            }            

            int idx=weight%26;

            sb.append(arr[idx]);
        }
        return sb.toString();
    }
}