class Solution {
    public int[] scoreValidator(String[] events) {
        int[] arr=new int[2];

        for(int i=0;i<events.length;i++)
        {
            String s=events[i];

            if(arr[1]==10) return arr;
            if(s.equals("1")) arr[0]++;

             if(s.equals("2")) arr[0]+=2;

             if(s.equals("3")) arr[0]+=3;

            if(s.equals("4")) arr[0]+=4;

            if(s.equals("6")) arr[0]+=6;

            if(s.equals("W")) arr[1]++;

            if(s.equals("WD")) arr[0]++;

            if(s.equals("NB")) arr[0]++;
        }
        return arr;
    }
}