class Solution {
    public int findKthPositive(int[] arr, int k) {
        //1. find the index of arr in between our k'th missing lies in
        //using binary search
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            int missingCounts = arr[mid] - mid - 1;
            if(missingCounts<k){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }

        //now we have indexes between our k'th missing lies in, ie: l,r
        //2. find out k'th missing rom this interval
        return l+k;

    }
}