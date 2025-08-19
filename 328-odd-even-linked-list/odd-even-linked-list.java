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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode temp=head;
        ListNode tempo=new ListNode(-1);
        ListNode tempe=new ListNode(-1);
        ListNode heado=tempo;
        ListNode heade=tempe;

        while(temp!=null)
        {
            tempo.next=temp;
            tempo=tempo.next;
            temp=temp.next;
            tempe.next=temp;
            if(temp!=null)
            {
                temp=temp.next;
                tempe=tempe.next;
            }
            else 
              break;
        }
        tempo.next=heade.next;
        return heado.next;

        
    }
}