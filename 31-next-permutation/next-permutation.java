class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind ==-1)
        {
            reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>=ind;i--)
        {
            if(arr[i]>arr[ind])
            {
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                break;
            }
        }
    
        reverse(arr,ind+1,n-1);
    }
        void reverse(int[] arr,int l,int r)
        {
            while(l<r)
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    
}