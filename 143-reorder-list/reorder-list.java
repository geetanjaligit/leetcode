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
    public void reorderList(ListNode head) {
        //find middle element
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse the second half of list
        ListNode n=null;
        ListNode prev=null;
        ListNode curr=slow;
        while(curr!=null)
        {
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        //reorder the elements of list
        ListNode first=head;
        ListNode second=prev;;
        while(second.next!=null)
        {
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}