class Solution {
    public String sortSentence(String s) {
        String[] strs = s.split(" ");
        String[] sortedArr = new String[strs.length];

        for(String str : strs){
            int index = str.charAt(str.length()-1) - '0';
            sortedArr[index-1] = str.substring(0,str.length()-1);
        } 
        String ans="";
        for(String str:sortedArr){
            ans+=str+" ";
        }

        return ans.trim();
    }
}