class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Create a monotonic stack
        Stack<Integer> stk = new Stack<>();
        int[] nextGreaterArr = new int[nums2.length];
        int i=nums2.length-1;
        while(i>=0){
            if(stk.isEmpty()){
                nextGreaterArr[i] = -1;
                stk.push(nums2[i]);
                i--;
            }else if(stk.peek()>nums2[i]){
                nextGreaterArr[i]= stk.peek();
                stk.push(nums2[i]);
                i--;
            }else{
                stk.pop();
            }
        }

        //Now for num:nums1 find next greater in nextGreaterArr by idx
        int[] ans= new int[nums1.length];
        for(i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i] = nextGreaterArr[j];
                }
            }
        }
        return ans;
    }
}