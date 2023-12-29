//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //Kadan's Algorithm
        
        int maxSum=Integer.MIN_VALUE;
        String ans="";
        
        int sum=0;
        String str="";
        for(char ch: w.toCharArray()){
            int ascii= (int)ch;
            
            //check for modified ASCII
            for(int i=0;i<x.length;i++){
                if(x[i]==ch){
                    ascii=b[i];
                }
            }
            
            sum+=ascii;
            str+=ch;
            
            if(sum>maxSum){
                maxSum=sum;
                ans=str;
            }
            
            if(sum<0){
                sum=0;
                str="";
            }
        }
        return ans;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends