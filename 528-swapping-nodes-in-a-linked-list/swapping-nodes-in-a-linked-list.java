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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode h=head;
        int size=0;
        while(h!=null){
            size++;
            h=h.next;
        }
         int n=size-k;
        ListNode h1=head;
       
        while(k>1){
            h1=h1.next;
            k--;
        }
        
        
        ListNode h2=head;
        while(n>0){
            h2=h2.next;
            n--;
        }

        //swap values
        int temp=h1.val;
        h1.val=h2.val;
        h2.val=temp;

        return head;
    }
}