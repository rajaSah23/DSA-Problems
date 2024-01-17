class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int a: arr){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        HashSet<Integer> hs= new HashSet<>();
        for(int key: hm.keySet()){
            int freq=hm.get(key);
            if(hs.contains(freq))
                return false;
            hs.add(freq);
        }
        return true;
    }
}