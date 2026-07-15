class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=n*(n+1);

        int ans=gcd(sumOdd,sumEven);

        return ans;
    }
    
    int gcd(int sumOdd,int sumEven)
    {
        int ans=0;
        int smaller=Math.min(sumOdd,sumEven);

        for(int i=1;i<=smaller;i++)
        {
            if(sumOdd%i==0 && sumEven%i==0)
            {
                ans=i;
            }
        }
        return ans;
    }
        
}