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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead=new ListNode(0);
        ListNode tail=dummyHead;

        while(list1!=null || list2 != null){
            if(list1 == null){
                tail.next=list2;
                break;
            }
            if(list2 == null){
                tail.next=list1;
                break;
            }

            if(list1.val<=list2.val){
                ListNode temp= list1.next;
                tail.next=list1;
                list1=temp;
            }else{
                ListNode temp= list2.next;
                tail.next=list2;
                list2=temp;
            }
            tail=tail.next;
        }
        return dummyHead.next;
    }
}