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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode h1=head;
        int size=0;
        while(h1.next!=null){
            h1=h1.next;
            size++;
        }
        size++;
        if(k%size==0) return head;
        h1.next=head;//making cycle
        //now: cut list after k node
        ListNode h2=head;
        k=k%size;
        int K= size-k;
        for(int i=0;i<K-1;i++){
            h2=h2.next;
        }
        head=h2.next;
        h2.next=null;
        
        return head;
    }
}