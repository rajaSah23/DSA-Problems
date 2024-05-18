class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int l=0;
        int r=0;
        HashSet<Character> hs= new HashSet<>();

        while(r<s.length()){
            if(!hs.contains( s.charAt(r))){
                hs.add( s.charAt(r));
                maxLength= Math.max(maxLength,hs.size());
                r++;
            }else{
                hs.remove( s.charAt(l));
                l++;
            }
        }
        return maxLength;

    }
}