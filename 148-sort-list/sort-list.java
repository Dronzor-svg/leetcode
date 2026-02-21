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
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        
        Collections.sort(list);
        temp=new ListNode(list.get(0));
        head=temp;
        for(int i=1;i<list.size();i++)
        {
            ListNode newNode = new ListNode(list.get(i));
            temp.next = newNode;   // link previous to new
            temp = newNode; 
        }
        return head;
    }
}