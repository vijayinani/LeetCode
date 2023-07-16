package leetcode_1_100;

import listnode.ListNode;

public class _19_RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        int[] values = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(-1);
        ListNode dummy = head;
        for (int val : values) {
            ListNode curr = new ListNode(val);
            head.next = curr;
            head = curr;
        }

        new _19_RemoveNthNodeFromEndOfList().removeNthFromEnd(dummy.next, 2);

        while (dummy != null) {
            System.out.println(dummy.val);
            dummy = dummy.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        int i = 0;
        while (i <= n) {
            p1 = p1.next;
            i++;
        }
        //if (p1 == null) {
        //    return head.next;
        //}
        //p1 = p1.next;
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return head;
    }
}
