class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target)
                return mid;
            //mid on Line1
           if(nums[l]<=nums[mid]){
               //case:target in left side on Line1
                if(nums[l]<=target && target<=nums[mid])
                    r=mid-1;
                else//target in right of Line2
                    l=mid+1;

            }else{//mid on Line2
                if(nums[mid]<=target && target<=nums[r])
                    l=mid+1;
                else
                    r=mid-1;
            }

        }
        return -1;
    }
}
