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
    public ListNode mergeNodes(ListNode head) {
        int sum=0;
        int cnt=0;
       
        ListNode temp=head;

        while(temp!=null && cnt!=2)
        {
            if(temp.val==0)
            {
                cnt++;
                if(cnt==2) 
                {
                    ListNode node = new ListNode(sum);
                    head=node;
                }

            }
            sum=sum+temp.val;
            temp=temp.next;
        }
        sum=0;
        cnt=1;
        ListNode pnt=head;
        while(temp!=null)
        {
            if(temp.val==0)
            {
                cnt++;

                if(cnt==2)
                {
                    pnt.next=new ListNode(sum);
                    pnt=pnt.next;
                    sum=0;
                    cnt=1;
                }
            }
            
            sum=sum+temp.val;
            temp=temp.next;
        }
        return head;
    }
}