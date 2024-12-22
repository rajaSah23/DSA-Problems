class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Create a monotonic stack
        Stack<Integer> stk = new Stack<>();
        // HashMap<element,nextGreater>
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i=nums2.length-1;
        while(i>=0){
            if(stk.isEmpty()){
                 //will store in HashMap<element,nextGreater>
                 hm.put(nums2[i],-1);
                stk.push(nums2[i]);
                i--;
            }else if(stk.peek()>nums2[i]){
                hm.put(nums2[i],stk.peek());
                stk.push(nums2[i]);
                i--;
            }else{
                stk.pop();
            }
        }

        //Now for num:nums1 find next greater in nextGreaterArr by idx
        int[] ans= new int[nums1.length];
        for(i=0;i<nums1.length;i++){
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }
}