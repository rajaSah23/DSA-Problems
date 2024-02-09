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
    ListNode ln;
    Node(ListNode ln){
        this.ln=ln;
    }

    public int compareTo(Node obj){
        return this.ln.val-obj.ln.val;
    }
}

class Solution {
    public ListNode sortList(ListNode head) {
        PriorityQueue<Node> pq= new PriorityQueue<>();
        while(head!=null){
            pq.add(new Node(head));
            head=head.next;
        }

        head=new ListNode(-1);
        ListNode tail=head;
        while(!pq.isEmpty()){
            Node node= pq.remove();
            node.ln.next=null;
            tail.next=node.ln;
            tail=tail.next;
        }

        return head.next;
    }
}