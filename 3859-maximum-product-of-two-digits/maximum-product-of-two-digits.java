class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();

        while(n>0)
        {
            int ld=n%10;
            list.add(ld);
            n=n/10;
        }

        Collections.sort(list);

        int a=list.get(list.size()-1);
        int b=list.get(list.size()-2);

        return a*b;
    }
}