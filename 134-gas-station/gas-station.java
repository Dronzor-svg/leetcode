class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total= 0;
        int su = 0;
        int start = 0;
        
        for(int i = 0; i < n; i++)
        {
            total+= gas[i] - cost[i];
            su += gas[i] - cost[i];
            if(su < 0){
                su = 0;
                start = i + 1;
            }
        }
        return (total < 0) ? -1 : start;
    }
}