class Solution {
    void reverseArr(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverseArr(nums,0,n-k-1);
        reverseArr(nums,n-k,n-1);
        reverseArr(nums,0,n-1);
    }
}