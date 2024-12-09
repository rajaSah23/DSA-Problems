class Solution {

    boolean binarySearch(int[] nums,int target){
        int l =0,r=nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(target == nums[mid]) return true;
            else if(target < nums[mid]) r = mid-1;
            else l =mid+1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr : matrix){
            if( binarySearch(arr,target) ) return true;
        }
        return false;
    }
}