class Solution {
    boolean canEat(int[] piles, int k, int h){
        int count=0;
        for(int pile:piles){
            if(pile % k ==0 ) count+=pile/k;
            else count+=pile/k+1;
        }
        return count<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=piles[0];
        for(int pile:piles)
            max=Math.max(max,pile);
        
        //so, search space: min,min+1,....,max
        while(min<max){
            int mid=min+ (max-min)/2;

            if(canEat(piles,mid,h))   //then, find in LHS for smaller one
                max=mid;
            else
                min=mid+1;              //then, find in RHS for possible k
            
        }
        return min;
    }
}