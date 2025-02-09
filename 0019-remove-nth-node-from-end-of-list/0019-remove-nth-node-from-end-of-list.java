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
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         //ListNode deleteHead = new ListNode(0);
//         if(head.val==n){
//             return head=head.next;
//         }
//         ListNode prev = null;
//         ListNode temp = head;
//         while(temp!=null && temp.val!=n){
//             prev = temp;
//             System.out.println(temp.val);
//             temp = temp.next;
            
//         }
//         prev.next = temp.next;
//         return head;
//     }

// }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //ListNode deleteHead = new ListNode(0);
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp= temp.next;
        }
        int newN = size-n;
        if(newN==0) return head.next;
        temp = head;
        ListNode prev = null;
        int i=0;
        while(temp!=null && i!=newN){
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
        return head;
    }

}