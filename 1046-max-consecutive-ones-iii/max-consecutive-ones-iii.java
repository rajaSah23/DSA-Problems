class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] window = new int[2];
        int ans=0;
        int startIdx=0;
        for(int i=0;i<nums.length;i++){
            window[nums[i]]++;
            if(window[0]<=k){
                ans= Math.max(ans,window[0]+window[1]);
            }else if(startIdx<=i){
                window[nums[startIdx]]--;
                startIdx++;
                window[nums[i]]--;
                i--;
            }
        }
        return ans;
    }
}