class Solution {
    public boolean canJump(int[] nums) {
        int targetIdx=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
            if(nums[i]>=targetIdx-i)
                targetIdx=i;

        return targetIdx==0;
    }
}