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
    public void reorderList(ListNode head) {
        Stack<ListNode> stk= new Stack<>();
        ListNode slow=head;
        ListNode fast=head;
        int n=0;
        while(fast!=null && fast.next!=null){
            n++;
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            stk.push(slow);
            slow=slow.next;
        }
        ListNode dummyHead=new ListNode(0);
        ListNode tail=dummyHead;
        while(n>=0){
            tail.next=head;
            head=head.next;
            tail=tail.next;
            if(!stk.isEmpty()){
                tail.next=stk.pop();
                tail=tail.next;
            }
            n--;
        }
        tail.next=null;
        head= dummyHead.next;
    }
}