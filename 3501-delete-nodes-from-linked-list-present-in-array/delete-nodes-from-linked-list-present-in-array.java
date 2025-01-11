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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs= new HashSet<>();
        for(int num:nums) hs.add(num);

        ListNode h = head;
        ListNode prevHead = null;
        while(h!=null && h.next != null ){
            if(hs.contains(h.val)){
                //delete node from LL 
                h.val = h.next.val;
                h.next = h.next.next;
            }else{
                prevHead=h;
                h=h.next;
            }
        }
        //check for last node
        if(hs.contains(h.val))
            prevHead.next=null;
        return head;
    }
}