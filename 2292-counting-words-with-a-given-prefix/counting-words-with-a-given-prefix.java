class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int n=pref.length();
        for(String word : words){
            if(n<=word.length())
                if(pref.equals(word.substring(0,n)))
                    count++;
                
            
        }
        return count;
    }
}