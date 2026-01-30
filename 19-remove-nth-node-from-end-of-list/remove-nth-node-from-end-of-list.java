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
        ListNode curr=head;
        ListNode prev=null;
        int count=0;
        int a=0;
        if(head==null || head.next==null) return null;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        
        a=count+1-n;
        curr=head;
        count=0;
        if(a==1) return head.next;
        curr = head;
        for (int i = 1; i < a - 1; i++) {
            curr = curr.next;
        }

       
        curr.next = curr.next.next;


        return head;
    }
}