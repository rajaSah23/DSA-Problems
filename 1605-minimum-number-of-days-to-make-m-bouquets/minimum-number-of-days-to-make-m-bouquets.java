class Solution {
    boolean isBouquetPossible(int[] bloomDay, int m, int k, int givenDays){
        int bouquets =0;
        int count=0;
        for(int bloom:bloomDay){
            if(bloom<=givenDays){
                count++;
            }else{
                bouquets += (count/k);
                count=0;
            }
        }
        bouquets += (count/k);
        return bouquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        //Search Space [1,10,3,10,2] 
        //1,2,3,4,5,6,7,8,9,10  ie: min to max element 
        int l=bloomDay[0];
        int r=bloomDay[0];
        for(int bloom:bloomDay){
            l = Math.min(l,bloom);
            r= Math.max(r,bloom);
        }

        //check
        if(bloomDay.length<m || bloomDay.length<k || bloomDay.length < m*k) return -1;

        //Now find the min possible days to make m garden
        while(l<r){
            int mid = l+(r-l)/2;
            if(isBouquetPossible(bloomDay,m,k,mid)){ //reduce days
                r=mid;
            }else{ //increase required days
                l= mid+1;
            }
        }

        return l;

    }
}