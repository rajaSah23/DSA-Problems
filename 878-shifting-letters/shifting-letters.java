
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long[] prefixArr = new long[shifts.length];  //arr of total shift count
        long sum = 0;
        for(int j=shifts.length-1;j>=0;j--){
            sum+=shifts[j];
            prefixArr[j] = sum%26;
        }
        

        String ans = "";
        for(int i=0;i<s.length();i++){
            ans+= (char)('a' + (( (s.charAt(i) - 'a') + prefixArr[i] )%26) );
        }
        return ans;

    }
}