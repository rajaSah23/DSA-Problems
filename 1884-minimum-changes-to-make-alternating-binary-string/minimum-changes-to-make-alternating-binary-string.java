class Solution {
    public int minOperations(String s) {
        int c1=0,c2=0;
        //when starts with 0
        for(int i=0;i<s.length();i++){
            int dig=s.charAt(i)-'0';

            if(dig != (i%2))
                c1++;
        }

        //when starts with 1
        for(int i=0;i<s.length();i++){
            int dig=s.charAt(i)-'0';

            if(dig != (i+1)%2)
                c2++;
        }

        return Math.min(c1,c2);
    }
}