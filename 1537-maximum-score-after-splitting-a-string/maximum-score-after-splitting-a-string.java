class Solution {
    public int maxScore(String s) {
        int score=0;
        int totalOnes = 0;
        for(char ch:s.toCharArray()){
            int dig=ch-'0';
            totalOnes+=dig;
        }
        int leftOnes=0;
        int rightOnes=totalOnes;
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            int dig=ch-'0';
            if(dig==0){
                leftOnes++;
            }else{
                rightOnes--;
            }

            score= Math.max(leftOnes+rightOnes,score);
        }
        return score;
    }
}