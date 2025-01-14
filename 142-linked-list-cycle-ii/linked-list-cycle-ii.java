/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow=head;
        ListNode fast= head.next;
        while(fast!=null && fast.next!=null && slow!=fast ){
            slow= slow.next;
            fast=fast.next.next;
        }
        if(fast==null || fast.next==null ) return null;
        
        slow= slow.next;
        while(head!=slow){
            head=head.next;
            slow=slow.next;
        }
        return head;


    }
}