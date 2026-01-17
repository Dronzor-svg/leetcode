class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans=1;
        int n=rowIndex;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        for(int i=1;i<=n;i++)
        {
            ans=ans*(n-i+1);
            ans/=i;
            list.add((int)ans);
        }
        
        return list;
    }
}