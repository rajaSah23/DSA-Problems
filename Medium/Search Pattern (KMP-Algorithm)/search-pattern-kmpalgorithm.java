//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            if(res.size()==0)
                System.out.print(-1);
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {   ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        for(int j=0;j<txt.length();j++){
            if(txt.charAt(j)==pat.charAt(0)){
                int k=0;
                for( k=0;(j+k)<txt.length()&&k<pat.length();k++){
                    if(txt.charAt(j+k)!=pat.charAt(k)){
                        break;
                    }
                }
                if(k==pat.length()){
                    ans.add(i+1);
                }
                j=i;
                i++;
            }else{
                i++;
            }
        }
        return ans;
    }
}