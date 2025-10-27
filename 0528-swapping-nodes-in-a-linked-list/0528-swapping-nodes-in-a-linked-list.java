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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy1 = new ListNode(0, head);
        ListNode dummy2 = dummy1;
        for(int i=0; i<k; i++){
            dummy1 = dummy1.next;
        }
        ListNode first = dummy1;
        while(dummy1!=null){
            dummy1 = dummy1.next;
            dummy2 = dummy2.next;
        }
        int temp = first.val;
        first.val = dummy2.val;
        dummy2.val = temp;
        return head;
    }
}