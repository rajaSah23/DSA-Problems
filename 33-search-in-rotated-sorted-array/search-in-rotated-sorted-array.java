class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid=(l+r)/2;
            
            if(nums[mid]==target) return mid;
            
            if(nums[mid]>=nums[r]){ //case:left line
                if(target>=nums[l] && target < nums[mid])  
                    r=mid-1;
                else
                    l= mid+1;
            }else{                 //case: right line
                if(target>nums[mid] && target<=nums[r])
                    l=mid+1;
                else
                    r=mid-1;
            }
        }

        return -1;
    }
}