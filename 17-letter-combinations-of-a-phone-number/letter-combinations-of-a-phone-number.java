class Solution {
    public String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        solve(0,sb,res,digits);
        return res;
    }
    public void solve(int indx,StringBuilder sb,List<String> res,String digits)
    {
        if(indx==digits.length())
        {
            res.add(sb.toString());
            return;
        }
        int d=digits.charAt(indx)-'0';

        String temp=map[d];
        for(int i=0;i<temp.length();i++)
        {
            sb.append(temp.charAt(i));
            solve(indx+1,sb,res,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}