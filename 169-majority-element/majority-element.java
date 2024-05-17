class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int num:nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        int major=nums[0];
        int count=0;
        for(int key:hm.keySet()){
            if(hm.get(key) > count ){
                major= key;
                count=hm.get(key);
            }
        }

        return major;
        
    }
}