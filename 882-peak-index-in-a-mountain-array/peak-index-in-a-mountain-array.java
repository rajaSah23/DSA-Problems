class Solution {
   
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(mid<arr.length-1 && arr[mid]>arr[mid+1])
                r= mid;
            else
                l=mid+1;
        }
        return l;
    }
}