class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: nums)
            pq.add(num);

        int n=nums.length-k;
        while(n>0){
            pq.remove();
            n--;
        }
        return pq.remove();
    }
}