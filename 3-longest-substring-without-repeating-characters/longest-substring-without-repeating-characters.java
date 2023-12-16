class Solution {
    public  int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        HashSet<Character> hs= new HashSet<>();
        int k=0,i=0;
        int length=0;
        while(i<s.length()){
            if(!hs.contains( s.charAt(i) ) ){
                hs.add(s.charAt(i));
                length=i-k+1;
                maxLength=Math.max(maxLength,length);
                i++;
            }else{
                hs.remove(s.charAt(k) );
                k++;
            }
            
        }
        return maxLength;
    }
}