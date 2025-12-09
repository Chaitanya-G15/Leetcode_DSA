
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode last = head;
        ListNode middle = head;
        while(last != null && last.next != null){
            middle = middle.next;
            last = last.next.next;
        }
        return middle;
    }
}
