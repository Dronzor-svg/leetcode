class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
       int col1=y;
       
       while(col1<=y+k-1)
       {
        int a=x;
        int b=x + k - 1;
        while(a<b)
        {
            int temp=grid[a][col1];
            grid[a][col1]=grid[b][col1];
            grid[b][col1]=temp;
            a++;
            b--;
        }
        col1++;
       }
       return grid;
    }
}