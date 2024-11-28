class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int fuel = 0;
        int startPoit=0;
        int reqFuel =0;
        for(int i=0;i<gas.length;i++){
            reqFuel += (gas[i]-cost[i]);
            fuel += gas[i];
            if(cost[i] > fuel) {
                fuel = 0;
                startPoit = i+1;
            }
            else fuel -=cost[i];
        }
        if(reqFuel<0) return -1;
        return startPoit;
    }
}