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
    // Method to merge a portion of list1 with list2
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // Initialize pointers for manipulation
        ListNode left = null; // Pointer to the node before the 'a'th node in list1
        ListNode right = list1; // Pointer to the 'b'th node in list1

        // Traverse until the 'b'th node in list1
        for (int i = 0; i <= b; i++) {
            if (i == a - 1) { // If the current node is the one before the 'a'th node
                left = right; // Update 'left' to point to this node
            }
            right = right.next; // Move 'right' pointer to the next node
        }
        
        // Connect the 'left' pointer to the head of list2
        left.next = list2;
        
        // Find the last node in list2
        ListNode temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        // Connect the last node of list2 to the node after the 'b'th node in list1
        temp.next = right;
        
        // Return the modified list1
        return list1;
    }
}
