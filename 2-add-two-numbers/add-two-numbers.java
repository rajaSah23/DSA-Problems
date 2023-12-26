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
        int carry=0;
        int sum=0;
        ListNode ansHead=null;
        ListNode tail=null;
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
            if(ansHead==null){
                ansHead= new ListNode(sum%10);
                tail=ansHead;
            }else{
                tail.next=new ListNode(sum%10);
                tail=tail.next;
            }
            
            
            carry=sum/10;
            sum=0;
        }
        //agar carry me abhi bhi value hoga to
        if(carry>0)  tail.next=new ListNode(carry);
        return ansHead;
    }
}