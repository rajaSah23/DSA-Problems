/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 class Node implements Comparable<Node>{
    ListNode node;
    Node(ListNode node){
        this.node= node;
    }

    public int compareTo(Node obj){
        return this.node.val-obj.node.val;
    }
 }
class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Node> pq= new PriorityQueue<>();
        for(ListNode head:lists){
            while(head!=null){
                pq.add(new Node(head));
                head=head.next;
            }
        }

        ListNode dummyHead=new ListNode(0);
        ListNode tail=dummyHead;
    
        while(!pq.isEmpty()){
            Node n= pq.remove();
            tail.next=n.node;
            tail=tail.next;
        }
        if(tail.next!=null) tail.next=null;

        return dummyHead.next;
    }

    
}