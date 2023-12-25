class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk= new Stack<>();
        int[] arr= new int[nums2.length];

        for(int i=nums2.length-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=nums2[i])
                stk.pop();
            
            if(stk.isEmpty())
                arr[i]=-1;
            else
                arr[i]=stk.peek();
            
            stk.push(nums2[i]);
        }

        //for ans
        int[] ans= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    ans[i]=arr[j];
                    break;
                }
            }
        }
        return ans;
    }
}