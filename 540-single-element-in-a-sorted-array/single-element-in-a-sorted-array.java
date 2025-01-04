class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if((mid==0 || nums[mid-1] != nums[mid]) && (mid==nums.length-1 || nums[mid]!= nums[mid+1])){
                return nums[mid];
            }else if(nums[mid-1] == nums[mid]){ 
                if(mid%2==0){ //case [odd,even] move left
                    r=mid;
                }else{        //case [even,odd] move left
                    l=mid+1;
                }
            }else{
                if(mid%2==1){ //case [odd,even] move left
                    r=mid-1;
                }else{        //case [even,odd] move left
                    l=mid;
                }
            }
        }
        return 0;
    }
}