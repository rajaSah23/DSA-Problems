class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        int major = nums[0];
        int freq=1;
        for(Integer el : hm.keySet()){
            if(hm.get(el)>freq){
                major = el;
                freq=hm.get(el);
            }
        }

        return major;
    }
}