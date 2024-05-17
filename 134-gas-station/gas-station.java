class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel=0;
        int fuel=0;
        int startIdx=0;
        for(int i=0;i<gas.length;i++){
            fuel+=gas[i]-cost[i];
            totalFuel+=gas[i]-cost[i];

            if(fuel<0){
                fuel=0;
                startIdx=i+1;
            }

        }
        if(totalFuel<0) return -1;
        return startIdx;
    }
}