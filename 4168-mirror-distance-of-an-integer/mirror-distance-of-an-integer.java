class Solution {
    public int mirrorDistance(int n) {
        int a=n;
        int sum=0;

        while(a>0)
        {
            int x=a%10;
            sum=sum*10+x;
            a/=10;
        }
        int z=Math.abs(n-sum);
        return z;
    }
}