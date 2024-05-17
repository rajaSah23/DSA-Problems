class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int last=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[last] && count<2){
                last++;
                nums[last]=nums[i];
                count++;
            }
            if(nums[i]>nums[last]){
                last++;
                nums[last]=nums[i];
                count=1;
            }
        }
        return last+1;
    }
}