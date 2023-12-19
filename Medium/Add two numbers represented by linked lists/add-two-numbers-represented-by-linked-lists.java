//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    static Node reverseList(Node head){
        if(head==null || head.next==null) return head;
        
        //iterative method
        Node curr=head;
        while(curr.next != null){
            Node h= curr.next;
            curr.next=curr.next.next;
            h.next=head;
            head=h;
        }
        return head;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        //1. Reverse both List
        first=reverseList(first);
        second=reverseList(second);
        //2. Now, add every digit one by one
        Node head=null;
        Node tail=null;
        int carry=0;
        while(first!=null || second!=null){
            int sum=0;
            if(first!=null){
                sum+=first.data;
                first=first.next;
            }
            if(second!=null){
                sum+=second.data;
                second=second.next;
            }
            
            sum+=carry;
            
            int dig=sum%10;
            carry=sum/10;
            
            
            //insert Node at head of the list
            Node newNode= new Node(dig);
            newNode.next=head;
            head=newNode;
            
        }
        if(carry!=0){
            Node newNode= new Node(carry);
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
}