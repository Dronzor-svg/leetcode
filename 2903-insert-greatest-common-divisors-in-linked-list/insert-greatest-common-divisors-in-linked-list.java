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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;

        ListNode curr=head.next;
        ListNode temp=head;
        
        while(curr!=null)
        {
            int div=gcd(temp.val,curr.val);
            ListNode pnt=new ListNode(div);

            pnt.next=temp.next;
            temp.next=pnt;
            temp=temp.next.next;
            curr=curr.next;
            
        }
        return head;
    }

    int gcd(int a, int b) {
    if (b == 0)
        return a;
    return gcd(b, a % b);
    }
}