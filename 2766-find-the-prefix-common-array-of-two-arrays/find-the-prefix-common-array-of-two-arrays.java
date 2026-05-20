class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;

        int[] C=new int[n];

        HashSet<Integer> st=new HashSet<>();
        int cnt=0;

        for(int i=0;i<n;i++)
        {
            if(A[i]==B[i])
            {
                st.add(A[i]);
                cnt++;
            }
            else
            {
                if(st.contains(A[i])) cnt++;
                else st.add(A[i]);

                if(st.contains(B[i])) cnt++;
                else st.add(B[i]);
            }
            C[i]=cnt;
        }
        return C;
    }
}