class Solution {
    void subSet(int[] nums, int idx,List<Integer> list ,List<List<Integer>> ans){
        if(idx >= nums.length){
            ans.add(new ArrayList<>(list));//copy krle, why?:  abe list ka address store krega kya.
            return;
        }

        list.add(nums[idx]);  //list me daala
        subSet(nums,idx+1,list,ans); //left side of recursion tree
        list.remove(list.size()-1);  //list se nikaala

        subSet(nums,idx+1,list,ans); //left side of recursion tree
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        subSet(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}