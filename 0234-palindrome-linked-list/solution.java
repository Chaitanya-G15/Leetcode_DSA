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
    ListNode curr;        // Global variable
    public boolean isPalindrome(ListNode head) {
        curr = head;
        return check(head);
    }

    public boolean check(ListNode head){
        if(head == null)return true;

        boolean ans = check(head.next) && head.val == curr.val;

        curr = curr.next;
        return ans;
    }
}
