class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= {-1,-1};
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid= (l+r)/2;
            if(nums[mid]==target){
                int i=mid,j=mid;
                while(i>=0 && nums[i]==target) i--;
                while(j<nums.length && nums[j] == target) j++;
                i++;
                j--;
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
            if(target<nums[mid]) r=mid-1;
            else l= mid+1;
        }
        return ans;
    }
}