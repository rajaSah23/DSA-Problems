class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count=0;
        int val=1;
        for(int num:nums){
            max = Math.max(max,count);
            val &=num;
            if(val==0){
                val=1;
                count =0;
            }else{
                count++;
            }
        }
        return Math.max(max,count);

    }
}