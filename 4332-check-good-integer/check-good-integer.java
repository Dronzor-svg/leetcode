class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=digitSum(n);
        int square=squareSum(n);

        if(square-sum>=50) return true;
        else return false;
    }

    int digitSum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }

        return sum;
    }

    int squareSum(int n)
    {
        int square=0;

        while(n>0)
        {
            square+=Math.pow((n%10),2);
            n=n/10;
        }
        return square;
    }
}