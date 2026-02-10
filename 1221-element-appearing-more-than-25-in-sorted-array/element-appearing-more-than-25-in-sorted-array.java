class Solution {
    public int findSpecialInteger(int[] arr) {
        int a=arr.length/4;
        int ans=0;
        if(arr.length==1) return arr[0];
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(mpp.get(arr[i])>a)
            return arr[i];
        }
        return -1;
    }
}