//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[],int n)
    {
        // add your code
        HashMap<String, Integer> hm = new HashMap<>();
        
        //Counting votes for each candidate
        for(String str:arr)
            hm.put(str, hm.getOrDefault(str,0)+1);
        
        //finding winner
        String winner="";
        int maxVotes=0;
        for(String candidate: hm.keySet()){
            int vote=hm.get(candidate);
            if(vote>maxVotes){
                winner=candidate;
                maxVotes=vote;
            }
            
            //Draw case
            else if(vote==maxVotes){
                int i=0;
                while(i<winner.length() && i<=candidate.length()){
                    if(i==candidate.length() || candidate.charAt(i)< winner.charAt(i) ){
                        winner=candidate;
                        break;
                    }else if(candidate.charAt(i)> winner.charAt(i)){
                        break;
                    }
                    i++;
                }
            }
        }
        
        
         String[] ans={winner,maxVotes+""};
        return ans;
    }
}

