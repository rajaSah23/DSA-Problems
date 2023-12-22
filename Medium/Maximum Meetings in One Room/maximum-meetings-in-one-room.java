//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends

class Pair implements Comparable<Pair>{
    int s;
    int f;
    int idx;
    Pair(int S, int F, int i){
        this.s=S;
        this.f=F;
        this.idx=i;
    }
    
    public int compareTo(Pair obj){
        return this.f-obj.f;
    }
}



class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
       Pair[] meetings= new Pair[N];
        
        for(int i=0;i<N;i++)
            meetings[i]=new Pair(S[i], F[i], i);
        
         Arrays.sort(meetings);//sort meeting by F time 
        ArrayList<Integer> ans= new ArrayList<>();
       
        int end=-1;
        for(Pair meeting:meetings){
            if(end<meeting.s){
                ans.add(meeting.idx+1);
                end=meeting.f;
            }
        }
        
        Collections.sort(ans);
        return ans;
    }
}
        
