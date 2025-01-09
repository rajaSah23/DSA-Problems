class Solution {
    boolean isPossibleSplit(int[] nums, int k,int maxSum){
        //devide nums into k subarrays -> find max sum -> find min among maxSums-> if its <=ans
        //count how many sub arrays we can create under maxSum -> check if count<=k
        int sum=0;
        int subArrayCount = 0;
        for(int num:nums){
            sum+=num;
            if(sum>maxSum){
                subArrayCount++;
                sum = num;
            }
        }
        subArrayCount++;
        return subArrayCount <= k;
    }
    public int splitArray(int[] nums, int k) {
        if(k>nums.length) return -1;//cant possible to split in k subarrays
        //now for nums = [7,2,5,10,8], k = 2
        //min possible sum = 10, tabhi n subarrays me split kr payenge,
                                //ie: let each subarray has one element , bole to k = n
        //max possible sum = sum of all elements , ie:only one subarray, bole to k=1

        //So, our search space is
        //10,11,12,13,....,sum(nums)
        int l=nums[0];
        int r = 0;
        for(int num:nums){
            l = Math.max(num,l);
            r+=num;
        }

        //Now binary search
        while(l<r){
            int mid = l + (r-l)/2;

            if(isPossibleSplit(nums,k,mid)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;

    }
}

//If still not clear, do
//1. Book Allocation Problem
//2. Painter paint Problem