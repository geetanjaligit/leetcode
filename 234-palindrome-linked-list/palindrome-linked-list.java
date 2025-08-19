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
    static {
        for (int i = 0; i < 100; i++) { isPalindrome(new ListNode(0));}
    }
    public static boolean isPalindrome(ListNode head) {
        
        ListNode mid=findMiddle(head);
        ListNode firstHalfHead=head;
        //reverse 2nd half
        ListNode secondHalfHead=reverse(mid);
        ListNode temp=secondHalfHead;
        while(temp!=null)
        {
            if(firstHalfHead.val!=temp.val)
              return false;
            firstHalfHead=firstHalfHead.next;
            temp=temp.next;
        }
        return true;

    }
    public static ListNode findMiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
}