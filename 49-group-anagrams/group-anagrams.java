class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm= new HashMap<>();
        for(String str :strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key= new String( charArr);
            List<String> list = hm.getOrDefault(key,new ArrayList() );
            list.add(str);
            hm.put(key, list );
        }

        return new ArrayList(hm.values());
    }
}