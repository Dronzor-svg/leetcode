class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num1<=100 && num2<=100) return 0;

        int left=num1;
        int right=num2;
        int cnt=0;

        while(left<=right)
        {
            String s = Integer.toString(left);

            for(int i=1;i<s.length()-1;i++)
            {
                if(s.charAt(i-1)<s.charAt(i) && s.charAt(i+1)<s.charAt(i)) cnt++;

                if(s.charAt(i-1)>s.charAt(i) && s.charAt(i+1)>s.charAt(i)) cnt++;

            }

            left++;
            
        }
        return cnt;
    }
}