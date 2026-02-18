/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNprev=ode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummynode=new ListNode(0);
        dummynode.next=head;
        ListNode  prev=dummynode;
        while(prev.next!=null && prev.next.next!=null)
        {
            ListNode first=prev.next;
            ListNode second=first.next;

            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev=first;
        }
        return dummynode.next;
    }
}