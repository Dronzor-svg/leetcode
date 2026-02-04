class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix[0].length;
        int m=matrix.length;
        int[][] preSum=new int[m][n];
        int maxArea=0;
        for(int j=0;j<matrix[0].length;j++)
        {
            int sum=0;
            for(int i=0;i<matrix.length;i++)
            {
                sum+=matrix[i][j]-'0';
                if(matrix[i][j]=='0') sum=0;
                preSum[i][j]=sum;
            }
        }   
        for(int i=0;i<m;i++)
        {
            maxArea=Math.max(maxArea,lHist(preSum[i]));
        }
        return maxArea;
    }
    int lHist(int[] heights)
    {
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        int nse=0;
        int pse=0;
        int element=0;
        for(int i=0;i<heights.length;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>heights[i])
            {
                element=st.peek();
                st.pop();
                nse=i;
                pse=st.isEmpty() ? -1 : st.peek();
                maxArea=Math.max(maxArea,heights[element]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            nse=heights.length;
            element=st.peek();
            st.pop();
            pse=st.isEmpty() ? -1  : st.peek();
            maxArea=Math.max(maxArea,(nse-pse-1)*heights[element]);
        }
        
        return maxArea;
    }
}