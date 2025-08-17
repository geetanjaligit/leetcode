/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr=headA;
        int sizeA=0;
        while(curr!=null)
        {
            sizeA++;
            curr=curr.next;
        }
        curr=headB;
        int sizeB=0;
        while(curr!=null)
        {
            sizeB++;
            curr=curr.next;
        }
        int diff=Math.abs(sizeA-sizeB);
        if(diff==0)
        {
            if(headA==headB)
            {
                return headA;
            }
            else{
            while(headA!=headB)
            {
                headA=headA.next;
                headB=headB.next;
            }
            return headA;
            }
        }
        ListNode temp=null;
        ListNode temp2=null;
        if(sizeA>sizeB)
        {
            temp=headA;
            for(int i=1;i<=diff;i++)
            {
                temp=temp.next;
            }
            temp2=headB;

        }
        else
        {
            temp=headB;
            for(int i=1;i<=diff;i++)
            {
                temp=temp.next;
            }
            temp2=headA;
        }
        while(temp!=temp2)
        {
            temp=temp.next;
            temp2=temp2.next;
        }
        return temp;
        
    }
}