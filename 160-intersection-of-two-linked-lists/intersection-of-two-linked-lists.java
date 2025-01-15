/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode h1 = headA;
        ListNode h2 = headB;
        while(h1!=h2){
            h1=h1.next;
            h2=h2.next;
            if(h1==null && h2==null) return null;
            if(h1==null) h1=headB;
            if(h2==null) h2=headA;
        }
        return h1;
    }
}