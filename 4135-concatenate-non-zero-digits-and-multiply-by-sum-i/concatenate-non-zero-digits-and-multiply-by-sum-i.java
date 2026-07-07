class Solution {
    public long sumAndMultiply(int n) {

        if(n==0) return n;
        long ans=0;
        long sum=0;
        int dup=n;
        while(dup>0)
        {
            int ld=dup%10;
            
            if(ld!=0) sum+=ld;

            dup=dup/10;
        }

        String num=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);

            if(ch!='0') sb.append(ch);
        }

        long num1 = Long.parseLong(sb.toString());

        return num1*sum;

    }
}