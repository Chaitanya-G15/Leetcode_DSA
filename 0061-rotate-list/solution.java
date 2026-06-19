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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        ListNode node = head , prev = head;
        int l = 1;
        while(node.next != null){
            node = node.next;
            l++;
        }

        int pos = k % l;

        if(pos == 0) return head;

        for(int i=0;i<l - pos - 1;i++){
            prev = prev.next;
        }

        ListNode newhead = prev.next;
        prev.next = null;
        node.next = head;

        return newhead;
    }
}
