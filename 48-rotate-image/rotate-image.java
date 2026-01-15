class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length-1;i++)
        {
            for(int j=i+1;j<matrix[i].length;j++)
            {
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
             int c = matrix[i].length / 2;
             for (int j = 0; j < c; j++) { 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = temp;
                }
                }

    }
}