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
    public ListNode insertionSortList(ListNode head) {
        ListNode insert=null;
        ListNode temp = head;
        while(temp!=null){
            insert = insert(temp.val, insert);
            temp = temp.next;
        }
        return insert;

    }
    public static ListNode insert(int data, ListNode insert){
        ListNode nn = new ListNode(data);
        if(insert==null){
            insert = nn;
            return insert;
        }
        if(insert.val>=data){
            nn.next = insert;
            insert = nn;
            return insert;
        }
        ListNode temp = insert;
        ListNode prev = null;
        while(temp!=null && temp.val<data){
            prev = temp;
            temp = temp.next;
        }
        prev.next = nn;
        nn.next = temp;
        return insert;
    }
}