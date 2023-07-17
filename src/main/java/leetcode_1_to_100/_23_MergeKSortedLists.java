package leetcode_1_to_100;

import listnode.ListNode;

import java.util.PriorityQueue;

public class _23_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> listNodePriorityQueue = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);

        for (ListNode l : lists) {
            if (l != null) {
                listNodePriorityQueue.add(l);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!listNodePriorityQueue.isEmpty()) {
            curr.next = listNodePriorityQueue.poll();
            curr = curr.next;

            if (curr.next != null) {
                listNodePriorityQueue.add(curr.next);
            }
        }
        return dummy.next;
    }
}
