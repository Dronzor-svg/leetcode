class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        int sum=gain[0];
        for(int i=1;i<gain.length;i++)
        {
            arr[i]=sum;
            sum+=gain[i];
        }
        arr[gain.length]=sum;
        Arrays.sort(arr);
        return arr[gain.length];
    }
}