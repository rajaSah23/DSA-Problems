//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Pair implements Comparable<Pair>{
    int arr;
    int dep;
    Pair(int a,int d){
        this.arr=a;
        this.dep=d;
    }
    
    public int compareTo(Pair o){
        return this.arr-o.arr;
    }
}

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        int count=1;
        // ArrayList<Pair> list = new ArrayList<>();
        Pair[] list = new Pair[arr.length];
        
        for(int i=0;i<arr.length;i++){
            list[i]=(new Pair(arr[i],dep[i]));
        }
        
        Arrays.sort(list);
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(list[0].dep);
        
        for(int i=1;i<arr.length;i++){
            Pair p= list[i];
            int a=p.arr;
            int d=p.dep; 
            if(!pq.isEmpty() && a>pq.peek()){
                pq.remove();
            }
            pq.add(d);
            count=Math.max(count,pq.size());
            
        }
        
        return count;
        
    }
    
}

