class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr=new int[2*nums.length];
        int len=2*nums.length;
        int a=nums.length-1;
        for(int i=0;i<len;i++)
        {
            if(i>=nums.length)
            {
                arr[i]=nums[a];
                a--;
            }
            else arr[i]=nums[i];

        }
        return arr;
    }
}