class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= {-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans[0]=i;
                while(i<nums.length && nums[i]==target)
                    i++;
                ans[1]=i-1;

                return ans;
            }
        }
        return ans;
    }
}