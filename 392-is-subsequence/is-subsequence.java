class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(char ch: t.toCharArray()){
            if(j>=s.length())   return true;
            
            else if(ch==s.charAt(j))   j++;
             
        }
        return j>=s.length();
    }
}