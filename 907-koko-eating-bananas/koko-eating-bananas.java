class Solution {
    boolean canEat(int[] piles, int k, int h){
        int time=0;
        for(int pile:piles){
            if(pile%k==0) time+=pile/k;
            else time+=pile/k +1;
        }
        return time<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        //Search space : 1,2,3,4,5,...11
        int l=1;
        int r=0;
        for(int pile:piles)
            r=Math.max(r,pile);

        while(l<r){
            int mid= l+(r-l)/2;
            if(canEat(piles,mid,h))
                r=mid;
            else
                l=mid+1;
        }
        return l;
    }
}