package leetcode_1_to_50;

import listnode.ListNode;

public class _24_SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            curr.next = second;
            first.next = second.next;
            second.next = first;
            curr = curr.next.next;
        }
        return dummy.next;
    }

}
