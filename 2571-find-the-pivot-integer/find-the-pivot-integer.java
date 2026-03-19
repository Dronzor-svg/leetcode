class Solution {
    public int pivotInteger(int n) {
        int[] arr1=new int[n+1];
        int[] arr2=new int[n+1];
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=i;
            arr1[i]=sum;
        }
        sum=0;
        for(int i=n;i>=0;i--)
        {
            sum+=i;
            arr2[i]=sum;
        }
        for(int i=0;i<=n;i++)
        {
            if(arr1[i]==arr2[i]) return i;
        }
        return -1;
    }
}