class Solution {
    public int trap(int[] height) {
        int l=0, r=height.length-1;
        int maxWater=0;
        while(l<r){
            if(height[l]<=height[r]){
                int i=l;
                for(i=l ;i<r && height[i]<=height[l];i++){
                    maxWater+=height[l]-height[i];
                }
                l=i;
            }else{
                int j=r;
                for(j=r;j>l && height[j]<=height[r];j--){
                    maxWater+=height[r]-height[j];
                }
                r=j;
            }
        }
        return maxWater;
    }
}