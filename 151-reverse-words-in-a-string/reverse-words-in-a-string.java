class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String word = "";
        for(char ch : s.toCharArray()){
            word+=ch;
            if(ch==' '){
                if(!word.equals(" ") )
                    ans=word+ans;
                word="";
            }
        }
        ans=word+" "+ans;
        return ans.trim();
    }
}