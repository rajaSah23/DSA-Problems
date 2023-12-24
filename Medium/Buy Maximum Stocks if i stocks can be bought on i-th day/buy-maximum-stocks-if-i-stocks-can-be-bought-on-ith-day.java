//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Node implements Comparable<Node>{
    int price;
    int limit;
    Node(int p, int idx){
        this.price=p;
        this.limit=idx;
    }
    
    public int compareTo(Node obj){
        return this.price-obj.price;
    }
}
class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        PriorityQueue<Node> pq= new PriorityQueue<>();
        for(int i=0;i<n;i++)
            pq.add(new Node(price[i],i+1));
        
        int count=0;
        while(!pq.isEmpty()){
            Node node= pq.remove();
            
            int l=node.limit;
            int p=node.price;
            
            while(k>=p && l>0){
                count++;
                k-=p;
                l--;
            }
        }
        return count;
    }
}
        
