class Solution {
    public int findDuplicate(int[] nums) {
        // int slow=nums[0];
        // int fast=nums[nums[0]];
        
        // while(slow != fast){ //go for do-while , this will not work at all
        //     fast = nums[nums[fast]];
        //     slow = nums[slow];
        // }

    //Detect the loop
        int slow=nums[0];
        int fast=nums[0];
        
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(slow != fast);
    
    //Reach to the ans/duplicate element
        int slow2=nums[0];
        while(slow != slow2){
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }
}