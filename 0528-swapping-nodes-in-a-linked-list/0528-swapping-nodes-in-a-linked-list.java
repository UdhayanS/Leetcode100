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
        ListNode temp = head;
        int size = 0;
        List<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int lNum = list.get(k-1);
        int rNum = list.get(list.size()-k);
        list.set(k-1, rNum);
        list.set(list.size()-k, lNum);
        ListNode node = new ListNode();
        head = node;
        for(int num: list){
            node.next = new ListNode(num);
            node = node.next;
        }
        return head.next;

    }
}