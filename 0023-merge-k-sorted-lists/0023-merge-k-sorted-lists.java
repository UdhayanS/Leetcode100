/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
        public static ListNode addMiddle(int val, ListNode res) {

    ListNode nn = new ListNode(val);
        if (res == null) {
            return nn; // If list is empty, return new node as head
        }
        if (res.val > val) {
            nn.next = res;
            return nn; // Insert before the current head
        }

        ListNode prev = null;
        ListNode temp = res;
        while (temp != null && temp.val < val) {
            prev = temp;
            temp = temp.next;
        }
        if(prev==null){
            nn.next = res;
            return nn;
        }
        prev.next = nn;
        nn.next = temp;
        return res;
    }


    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null; // Start with an empty list
        if (lists.length == 0) return null;

        int size = lists.length - 1;
        while (size >= 0) {
            ListNode tempHead = lists[size]; // Get the current list head
            while (tempHead != null) {
                res = addMiddle(tempHead.val, res); // Update res correctly
                tempHead = tempHead.next;
            }
            size--;
        }
        return res; 

    }
}