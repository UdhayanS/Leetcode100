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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        while(temp!=null){
            if(!set1.add(temp.val)){
                set2.add(temp.val);
            }
            temp = temp.next;
        }
        temp = head;
        
        while(temp!=null){
            if(set2.contains(temp.val)){
                if(prev==null){
                    head=temp.next;
                }
                else{
                    prev.next = temp.next;
                }
            }
            else prev = temp;
            temp = temp.next;
        }
        return head;
    }
}