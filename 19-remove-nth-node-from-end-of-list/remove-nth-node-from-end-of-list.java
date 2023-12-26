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
        int size=0;
        ListNode h=head;
        while(h!=null){
            size++;
            h=h.next;
        }
        
        int N= size-n-1;
        //Chalo ab Taget Node k pass (N'th from begin)
        h=head;
        while(N>0){
            h=h.next;
            N--;
        }
        if(N<0) return head.next;//-ve N matlb 1st wala node delete krna h
        
        h.next=h.next.next;
        return head;
    }
}