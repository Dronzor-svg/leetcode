class Solution {
    public int[] finalPrices(int[] prices) {
        int[] arr=prices;

        Stack<Integer> st=new Stack<>();

        for(int i=0; i< prices.length;i++)
        {
            while(!st.isEmpty() && prices[st.peek()]>=prices[i])
            {
                arr[st.pop()]-=prices[i];
            }
            st.add(i);
        }

        return arr;
    }
}      