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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        if(head.next==null) return null;
        int size=0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        size = size/2+1;
        System.out.println(size);
        int i=1;
        temp = head;
        ListNode prev = null;
        while(temp!=null){
            
           
            if(i==size){
                prev.next = temp.next;
                return head;
            }
            prev = temp;
            temp = temp.next;
            i++;
        }
        return head;
    }
}