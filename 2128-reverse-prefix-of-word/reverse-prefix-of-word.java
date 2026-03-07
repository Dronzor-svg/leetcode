class Solution {
    public String reversePrefix(String word, char ch) {
        String s=Character.toString(ch);
        if(!word.contains(s)) return word;
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                idx++;
                st.push(word.charAt(i));
                break;
            }
            st.push(word.charAt(i));
            idx++;
        }
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        for(int i=idx;i<word.length();i++)
        {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}