class Solution {
    public int[] searchRange(int[] nums, int target) {
        //1. BruteForce O(n*n)
        //2. Sliding Window O(n)
        //3. Binary search O(logn):
        int l=0,r=nums.length-1;
        int[] ans= new int[2];
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                l=mid;
                r=mid;
                while(l>=0 && nums[l]==target)
                    l--;
                ans[0]=++l;
                while(r<=nums.length-1&& nums[r]==target)
                    r++;
                ans[1]=--r;

                return ans;
            }else if(target<nums[mid])
                r=mid-1;
            else
                l=mid+1;
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
}