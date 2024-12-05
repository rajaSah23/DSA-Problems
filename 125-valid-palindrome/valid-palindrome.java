class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else if( s.charAt(l)<=47 || (58<= s.charAt(l) &&  s.charAt(l)<=96) || 123<= s.charAt(l))
                l++;
            else if(s.charAt(r)<=47 || (58<= s.charAt(r) &&  s.charAt(r)<=96) || 123<= s.charAt(r))
                r--;
            else
                return false;
            
        }
        return true;
    }
}