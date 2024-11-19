class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs= new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(target-nums[i])){
                ans[0]= hs.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }else{
                hs.put(nums[i],i);
            }
        }

        return ans;
    }
}