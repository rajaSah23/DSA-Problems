class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs[0].length();
        for(String str: strs) n= Math.min(n,str.length());

        String ans="";
        String pattern=strs[0];

        for(int j=0;j<n;j++){
            int i=0;
            for(i=0;i<strs.length;i++)
                if(strs[i].charAt(j) != pattern.charAt(j) ) break;
            
            if(i!=strs.length) break;
            
            ans+=pattern.charAt(j);
        }
        return ans;
    }
}