class Solution {
    boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefixSum = new int[words.length+1];
        for(int i=0;i<words.length;i++){
            String str= words[i];
            if(( isVowel(str.charAt(0) ) && isVowel(str.charAt(str.length()-1) ) )){
                prefixSum[i+1] =  prefixSum[i]+1 ;
            }else{
                 prefixSum[i+1] =  prefixSum[i];
            }
        }

        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int[] query = queries[i];
            ans[i] =  prefixSum[query[1]+1] - prefixSum[query[0]] ;
        }
        return ans;
    }
}