class Solution {
    boolean canEat(int k,int[] piles, int h){
        int time =0;
        for(int pile:piles){
            time+= pile/k;

            if(pile%k > 0) time++;
        }
        return time<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        //search space : 1,2,3,...,Max in piles[]
        int maxSpeed = piles[0];
        for(int pile:piles)
            maxSpeed = Math.max(pile,maxSpeed);
        
        int l=1;
        int r=maxSpeed;

        while(l<r){
            int mid = l+(r-l)/2;
            if(canEat(mid,piles,h)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}