class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int last=0;
        for(int i=1;i<nums.length;i++){
            if( count < 2 || nums[last] != nums[i]){
                nums[last+1] = nums[i];
                if(nums[last] != nums[i]) count=0;
                count++;
                last++;
            }
        }
        return last+1;
    }
}