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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h= head;
        int size = 0;
        while(h!=null){
            size++;
            h=h.next;
        }
        n= size-n;
        h=head;
        while(n>1){
            h= h.next;
            n--;
        }

        if(n==0) return head.next;
        h.next = h.next.next;
        return head;
    }
}