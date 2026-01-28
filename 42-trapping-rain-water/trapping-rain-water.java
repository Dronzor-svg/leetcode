class Solution {
    public int trap(int[] arr) {
        int lmax=0;
        int rmax=0;
        int total=0;
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if(arr[left]<=arr[right])
            {
                if(arr[left]<lmax) total+=lmax-arr[left];
                else lmax=arr[left];
                left++;
            }
            else
            {
                if(arr[right]<rmax) total+=rmax-arr[right];
                else rmax=arr[right];
                right--;
            }
        }
        return total;
    }
}