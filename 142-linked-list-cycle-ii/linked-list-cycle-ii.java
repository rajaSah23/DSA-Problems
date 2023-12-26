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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){ //loop detected
                break;
            }
        }
        if(fast==null || fast.next==null) return null;//agar loop nhi h

        //agar loop hoga to
        slow=head;
        //slow(at head) aur fast dono ko ek ek krke aage badhao, jaha pe milega whi connect point hoga   
        while(slow!= fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}