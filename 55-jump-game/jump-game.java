class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length-1;
        int idx= last;
        while(idx>=0){
            if(nums[idx] >= last - idx) last= idx;
            idx--;
        }

        return last==0;
    }
}