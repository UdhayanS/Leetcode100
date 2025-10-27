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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head;
        ListNode curr = head;
        int ind = 0;
        int size = 0;
        while(curr!=null){
            size += 1;
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            if(ind == 0 && size-n==0){
                return head.next;
            }
            if(ind==size-n){
                prev.next = curr.next;
                return head;
            }
            prev = curr;
            curr = curr.next;
            ind++;

        }
        return head;

    }
}