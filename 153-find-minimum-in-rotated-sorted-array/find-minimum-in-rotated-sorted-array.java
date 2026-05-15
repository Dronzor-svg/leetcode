class Solution {
    public int findMin(int[] arr) {
        int left=0;
        int right=arr.length-1;

        if(arr[arr.length-1]>arr[0]) return arr[0];
        if(arr.length==1) return arr[0];
        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(arr[mid]>arr[mid+1]) return arr[mid+1];

            else if(mid<arr.length && arr[mid]<arr[mid-1])
            {
                return arr[mid];
            }

            else if(arr[right]>arr[mid]) right=mid-1;

            else left=mid+1;
        }
        return arr[left];
    }
}