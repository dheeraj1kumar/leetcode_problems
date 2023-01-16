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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int s=0;
        ListNode temp=head;
        while(temp!=null){
temp=temp.next;
        s++;
        }
     int f=s-n;           
        if(s==n){
       head=head.next;
           
            return head;
        }
        int i=1;

        ListNode prev=head;
        while(i<f){
prev=prev.next;
        i++;}
  prev.next=prev.next.next;
        return head;
    }
}

/*
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++)
        fast = fast.next;
        if (fast == null) 
        return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}*/