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
    public ListNode sortList(ListNode head) {
   ArrayList<Integer> al=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            al.add(curr.val);
                curr=curr.next;
        }
         Collections.sort(al);
        ListNode head2 =new ListNode(0);
        ListNode res=head2;
        for(int i:al){
            ListNode newnode=new ListNode(i);
            res.next=newnode;
            res=newnode;
            
        }
        return head2.next;
    }
}



