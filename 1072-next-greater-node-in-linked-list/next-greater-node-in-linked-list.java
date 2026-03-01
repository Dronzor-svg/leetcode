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
    public int[] nextLargerNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        int[] nge=new int[n];
        head=reverse(head);
        int i=0;
        while(head!=null)
        {
            while(!st.isEmpty() && st.peek().val<=head.val)
            {
                st.pop();
            }
            if(st.isEmpty()) nge[i]=0;
            else nge[i]=st.peek().val;
            st.push(head);
            head=head.next;
            i++;
        }
        nge=reverse1(nge);
        return nge;
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
    int[] reverse1(int[] nge)
    {
        int right=nge.length-1;
        int left=0;
        while(left<=right)
        {
            int temp=nge[left];
            nge[left]=nge[right];
            nge[right]=temp;
            left++;
            right--;
        }
        return nge;
    }
}