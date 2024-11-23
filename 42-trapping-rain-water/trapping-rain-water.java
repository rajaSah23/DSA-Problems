class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int totalWater = 0;
        while(l<r){
            if(height[l]<=height[r]){
              int i=l;
              while(i<r && height[l]>=height[i]){
                totalWater+=height[l]-height[i];
                i++;
              }
                l=i;
            }else{
                int j=r;
              while(j>l && height[r]>=height[j]){
                totalWater+=height[r]-height[j];
                j--;
              }
              r=j;
            }
        }
        return totalWater;
    }
}