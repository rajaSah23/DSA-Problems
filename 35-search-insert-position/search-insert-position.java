class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length;
        while(l<r){
            int mid=(l+r)/2;
            if(target<=nums[mid]){
                r=mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}