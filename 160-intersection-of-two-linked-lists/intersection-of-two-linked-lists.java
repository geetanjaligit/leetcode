/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNod33e(int x) {
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
        ListNode tempA=headA;
        ListNode tempB=headB;
        if(sizeA>sizeB)
        {
            for(int i=1;i<=diff;i++)
            {
                tempA=tempA.next;
            }
        }
        else
        {
            for(int i=1;i<=diff;i++)
            {
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB)
        {
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
        
    }
}