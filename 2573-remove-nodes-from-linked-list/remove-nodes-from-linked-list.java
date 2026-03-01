class Solution {
    public ListNode removeNodes(ListNode head) {

        head = reverse(head);

        int max = Integer.MIN_VALUE;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (head != null) {

            if (head.val >= max) {
                max = head.val;
                curr.next = head;
                curr = curr.next;
            }

            head = head.next;
        }

        curr.next = null;

  
        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}