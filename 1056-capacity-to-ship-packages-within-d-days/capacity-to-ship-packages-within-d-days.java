class Solution {
    boolean canShip(int[] weights, int capacity, int days){
        int countDays=0;
        int sum=0;
        for(int weight:weights){
            if(sum+weight>capacity){
                countDays++;
                sum=0;
            }
            sum+=weight;
        }
        countDays++;
        return countDays<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=weights[0];
        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }
        //search space: 0,1,2,3,....,totalSum
        while(left<right){
            int mid= left +(right-left)/2;
            
            if(canShip(weights,mid,days)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}