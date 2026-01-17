class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            list.add(generateRow(i));
        }
        return list;
    }
    public List<Integer> generateRow(int row)
    {
        int ans=1;
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add(1);
        for(int col=1;col<row;col++)
        {
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
}