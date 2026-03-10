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
    public int pairSum(ListNode head) {
        int cnt=0;
        ListNode temp=head;
        ListNode dummynode=null;
        int max=0;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        temp=head;
        int a=0;

        while(a<cnt/2)
        {
            a++;
            temp=temp.next;
        }
        ListNode temp2=reverse(temp);
        temp=head;
        while(temp2!=null)
        {
            max=Math.max(max,temp.val+temp2.val);
            temp2=temp2.next;
            temp=temp.next;
        }


        
        return max;
    }
    ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}