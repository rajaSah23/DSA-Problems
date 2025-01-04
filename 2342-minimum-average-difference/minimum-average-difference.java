class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long[] leftArr = new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            long avg = sum/(i+1);
            leftArr[i] = avg;
        }

        long[] rightArr = new long[n+1];
        sum=0;
        for(int j=n-1;j>=0;j--){
            sum+=nums[j];
            long avg = sum/(n-j);
            rightArr[j] = avg;
        }
        
        int minIdx=0;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(Math.abs(leftArr[i] - rightArr[i+1])<min){
                min = Math.abs(leftArr[i] - rightArr[i+1]);
                minIdx = i;
            }
        }
        return minIdx;
    }
}