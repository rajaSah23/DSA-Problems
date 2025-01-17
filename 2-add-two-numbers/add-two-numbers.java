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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 =l1;
        ListNode h2 =l2;

        ListNode ansHead= new ListNode(0);
        ListNode ansTail= ansHead;
        int borrow=0;
        while(h1!=null && h2!=null ){
            int sum =h1.val+h2.val+borrow;
            ansTail.next= new ListNode(sum%10 );
            borrow=sum/10;
            ansTail=ansTail.next;
            h1=h1.next;
            h2=h2.next;
        }
        while(h1!=null){
                int sum =h1.val+borrow;
                ansTail.next= new ListNode( sum%10 );
                borrow=sum/10;
                ansTail=ansTail.next;
                h1=h1.next;
        }
        while(h2!=null){
            int sum =h2.val+borrow;
                ansTail.next= new ListNode( sum%10 );
                borrow=sum/10;
                ansTail=ansTail.next;
                h2=h2.next;
        }
        if(borrow!=0){
            ansTail.next= new ListNode(borrow%10);
            ansTail=ansTail.next;
        }
        return ansHead.next;
    }
}