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
    private ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return last;
    }
    
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);

        int maximum = 0;
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            maximum = Math.max(maximum, current.val);

            if (current.val < maximum) {
                prev.next = current.next;
                ListNode deleted = current;
                current = current.next;
                deleted.next = null;
            }

            else {
                prev = current;
                current = current.next;
            }
        }
        
        return reverseList(head);
    }
}
