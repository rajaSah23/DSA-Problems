class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<r){
            int mid =(l+r)/2;
            if(target <= nums[mid]){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        r=l;
        while(r<nums.length && nums[r]==target) r++;
        r--;
        if(nums.length==0) return new int[]{-1,-1};
        if(nums[l]!=target) return new int[]{-1,-1};
        return  new int[]{l,r};
    }
}