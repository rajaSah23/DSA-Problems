//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isAll(int[] freq){
        for(int i=0;i<freq.length;i++)
            if(freq[i]<=0) return false;
        return true;
    }
    public int smallestSubstring(String S) {
        // Code here
        
        int minWin=S.length()+1;
        int[] freq=new int[3];
        int i=0;
        int j=0;
        while(i<S.length()){
            if(isAll(freq)){
                minWin=Math.min(minWin,j-i);
                freq[S.charAt(i)-'0']--;
                i++;
            }else if(j<S.length()){
                freq[S.charAt(j)-'0']++;
                j++;
            }else{
                freq[S.charAt(i)-'0']--;
                i++;
            }
        }
        if(minWin>S.length()) return -1;
        return minWin;
    }
};
