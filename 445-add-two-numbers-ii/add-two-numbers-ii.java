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
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        int carry=0;
        int sum=0;
        ListNode ansHead=new ListNode(0); //dummy node
        ListNode tail=ansHead;
        while(l1!=null || l2!=null){
            sum+=carry;
            
            if(l1!=null){  //list 1
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){  //list 2
                sum+=l2.val;
                l2=l2.next;
            }

            //put into ans List
                tail.next=new ListNode(sum%10);
                tail=tail.next;
            
            carry=sum/10;
            sum=0;
        }
        //agar carry me abhi bhi value hoga to
        if(carry>0)  tail.next=new ListNode(carry);
        return ansHead.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverseList(l1);   //leetcode 206
        l2=reverseList(l2);

        ListNode ans=addTwoNumbers1(l1,l2);  //leetcode 2
        return reverseList(ans);
    }
}