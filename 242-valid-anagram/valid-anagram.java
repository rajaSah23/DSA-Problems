class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charArr = new int[26];
        for(char ch : s.toCharArray()) charArr[ch-'a']++;
        for(char ch : t.toCharArray()) charArr[ch-'a']--;

        for(int el : charArr) if(el != 0 ) return false;
        return true;
    }
}