class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String> > ans=new ArrayList<>();
        HashMap<String,List<String> > hm= new HashMap<>();

        for(String str:strs){
            char[] chArr= str.toCharArray();
            Arrays.sort(chArr);
            String key=new String(chArr);
            if(hm.containsKey(key)){
               hm.get(key).add(str);
            }else{
                hm.put(key,new ArrayList<>(List.of(str)));
            }
        }
        
        for(String key: hm.keySet()){
            ans.add(hm.get(key));
        }

        return ans;
    }
}