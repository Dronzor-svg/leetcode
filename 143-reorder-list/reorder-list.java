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
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode half=slow.next;
        slow.next=null;
        ListNode pre=null;
        while(half!=null)
        {
            ListNode temp=half.next;
            half.next=pre;
            pre=half;
            half=temp;
        }
        ListNode l1=head;
        ListNode l2=pre;
        while(l2!=null)
        {
            ListNode t1=l1.next;
            ListNode t2=l2.next;
            l1.next=l2;
            l2.next=t1;
            l1=t1;
            l2=t2;
        }

    }
}