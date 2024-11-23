class Solution {
    public boolean isAnagram(String s, String t) {
        //method 2
        HashMap<Character,Integer> hm= new HashMap<>();
        for(char ch : s.toCharArray())
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        for(char ch : t.toCharArray()){
            if(!hm.containsKey(ch)) return false;
            else if(hm.get(ch)<=0) return false;
            else hm.put(ch, hm.get(ch)-1);
        }

        for(Integer itr : hm.values()){
            if(itr>0) return false;
        }
        return true;
    }
}