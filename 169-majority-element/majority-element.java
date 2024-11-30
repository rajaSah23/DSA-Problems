class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int freq=0;
        for(int num: nums){
            if(major != num){
                freq--;
                if(freq < 0) {
                    major = num;
                    freq=0;
                }
            }else{
                freq++;
            }
        }
        return major;
    }
}