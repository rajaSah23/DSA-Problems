public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++){
            ans<<=1;
            int lsb=(n&1);
            ans=ans | lsb;
            n>>=1;
        }
        return ans;
    }
}
