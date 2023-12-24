class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //count freq in p and store it as a pattern[]
        int[] pattern = new int[26];
        for(char ch: p.toCharArray())
            pattern[ch-'a']++;

        List<Integer> ans= new ArrayList<>();
         //Now find anagram
        int[] window=new int[26];
        for(int i=0;i<s.length();i++){
            window[s.charAt(i)-'a']++; //increase frq. of new element

            if(i>=p.length()-1)  //i.e:sliding window size
            {
                int j=0;
                for(j=0;j<pattern.length;j++){
                    if(window[j]!=pattern[j])
                        break;
                }
                if(j==pattern.length){//anagram found
                    ans.add(i-(p.length()-1));
                }
                //decrease freq of last deleted element of window
                window[s.charAt(i-(p.length()-1))-'a']--;
            }

        }
        return ans;
    }
}