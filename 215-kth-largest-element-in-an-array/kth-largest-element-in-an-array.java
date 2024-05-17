class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int num:nums) 
            pq.add(num);
        k=nums.length -k+1;
        while(k>1){
            pq.remove();
            k--;
        }
        return pq.remove();
    }
}