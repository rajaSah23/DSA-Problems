class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        int n=Integer.MAX_VALUE;
        for(String s: strs)
            n=Math.min(n, s.length());

        for(int i=0;i<n;i++){
            char ch=strs[0].charAt(i);
            int j=0;
            for(j=1;j<strs.length;j++){
                if(!(strs[j].charAt(i)==ch)){
                    break;
                }
            }

            if(j==strs.length)
                str+=ch;
            else return str;
        }

        return str;
    }
}