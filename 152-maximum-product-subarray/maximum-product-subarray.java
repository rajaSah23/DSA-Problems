class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int prod = 1;
        for(int num:nums){
            prod *= num;
            maxProd = Math.max(prod, maxProd);
            if(prod==0) prod = 1;
        }

        prod =1;
        for(int i=nums.length-1;i>=0;i--){
            prod *= nums[i];
            maxProd = Math.max(prod, maxProd);
            if(prod==0) prod = 1;
        }

        return maxProd;

    }
}