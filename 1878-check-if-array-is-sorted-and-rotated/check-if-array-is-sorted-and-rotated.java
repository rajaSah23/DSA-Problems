class Solution {
    public boolean check(int[] nums) {
        //Approach : i will allow only one break point in sorting
        int count = 0;
        int prev=nums[0];
        for(int num:nums){
            if(prev>num){ 
                if(count>=1) return false;  //ie: already a breakpoint
                count++;  //mark as a breakpoint
            }
            prev =num;
        }
        //if a breakpoint, then must follow this condition
        if(count>0 && nums[0]<nums[nums.length-1]) return false;
        return true;
    }
}