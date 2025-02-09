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
    public static ListNode addMiddle(int val, ListNode res) {
        ListNode nn = new ListNode(val);
        if (res == null) {
            return nn;
        }
        if (res.val > val) {
            nn.next = res;
            return nn;
        }
        ListNode prev = null;
        ListNode temp = res;
        while (temp != null && temp.val < val) {
            prev = temp;
            temp = temp.next;
        }
         if (prev == null) {
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
        
        for (ListNode head : lists) { // Loop through each linked list
            while (head != null) {
                res = addMiddle(head.val, res); // Insert each node in sorted order
                head = head.next;
            }
        }
        return res;
    }
}
