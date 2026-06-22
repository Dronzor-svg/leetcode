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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = null;
        ListNode nextB = null;
        ListNode temp = list1;
        int idx = 0;

        
        while (temp != null) {
            if (idx == a - 1) {
                prevA = temp;
            }
            if (idx == b + 1) {
                nextB = temp;
                break;
            }
            temp = temp.next;
            idx++;
        }

        
        prevA.next = list2;

       
        temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }

        
        temp.next = nextB;

        return list1;
    }
}