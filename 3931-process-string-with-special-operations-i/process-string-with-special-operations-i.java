class Solution {
    public String processStr(String s) {
        StringBuilder result=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch=='*' && result.length()>=1)
            {
                result.deleteCharAt(result.length() - 1);
            }
            else if(ch=='#')
            {
                result=result.append(result);
            }
            else if(ch=='%')
            {
                result=result.reverse();
            }
            else if(Character.isLetter(ch))
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
}