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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode tail=head;
        while(tail.next != null){
            ListNode h=tail.next;
            tail.next=tail.next.next;
            h.next=head;
            head=h;
        }
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=reverseList(slow);
        while(slow!=null){
            if(head.val!=slow.val)
                return false;

            head=head.next;
            slow=slow.next;
        }
        return true;
    }
}