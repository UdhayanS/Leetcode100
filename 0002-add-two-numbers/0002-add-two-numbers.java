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
        ListNode node = new ListNode();
        ListNode temp = node;
        int carry = 0;
        while(l1!=null && l2!=null){
            int sum = l1.val+l2.val+carry;
            if(sum>=10){
                
                temp.next = new ListNode(sum%10);
                carry = 1;
            }
            else{
                temp.next = new ListNode(l1.val + l2.val+carry);
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }
        while(l1!=null){
            int sum = l1.val+carry;
            if(sum>=10){
                
                temp.next = new ListNode(sum%10);
                carry = 1;
            }
            else{
                temp.next = new ListNode(l1.val+carry);
                carry = 0;
            }
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2!=null){
            int sum = l2.val+carry;
            if(sum>=10){
                
                temp.next = new ListNode(sum%10);
                carry = 1;
            }
            else{
                temp.next = new ListNode(l2.val+carry);
                carry = 0;
            }
            l2 = l2.next;
            temp = temp.next;
        }
        if(carry==1){
            temp.next = new ListNode(1);
        }
        return node.next;
    }
}