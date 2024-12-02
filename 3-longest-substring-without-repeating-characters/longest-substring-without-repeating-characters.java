class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength =0;
        String subString = "";
        for(int i=0;i<s.length();i++){
            if(subString.indexOf(s.charAt(i))>=0){
                subString = subString.substring(1,subString.length());
                i--;
            }else{
                subString = subString+s.charAt(i);
            }

            maxlength = Math.max(maxlength,subString.length());
        }

        return maxlength;
    }
}