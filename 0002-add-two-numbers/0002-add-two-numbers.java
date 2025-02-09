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
        ListNode sumHead = new ListNode(0);
        ListNode temp = sumHead;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            //carry = 0;
            int sum = carry;
            int n1 = 0;
            int n2 = 0;
            if(l1!=null){
                n1 = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                n2 = l2.val;
                l2 = l2.next;
            }
            sum += n1+n2;
            int digit = sum%10;
           
            carry = sum/10;
             System.out.println(carry);
            temp.next = new ListNode(digit);
            System.out.println(digit);
            temp = temp.next;
        
    }
        return sumHead.next;    
    }
}