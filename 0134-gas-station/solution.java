class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tcost = 0;
        int tgas  = 0;
        
     for(int i = 0; i < n;i++){
        tgas  += gas[i];
        tcost += cost[i];
        }

        if(tgas < tcost)return -1;

        int rgas  = 0;
        int start = 0;

        for(int i = 0; i < n ; i++){
            rgas += (gas[i] - cost[i]);
            if(rgas < 0 ){
                rgas = 0;
                start = i+1;
            }
       
    }
    return start;
    }
}
