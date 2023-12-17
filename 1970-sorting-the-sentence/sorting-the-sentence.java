class Solution {
    public String sortSentence(String s) {
        String ans="";
        String[] words= s.split(" ");
        String[] strs= new String[words.length];
        for(String word:words){
            int n=(word.charAt(word.length()-1) - '0');
            String str=word.substring(0,word.length()-1);
            
            strs[n-1]=str;
        }
        for(String str:strs){
            ans+=str+" ";
        }
        return ans.trim();
    }
}