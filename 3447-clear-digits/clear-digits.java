class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9')
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}