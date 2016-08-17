package leetcode;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class Problem2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2, int add) {
        ListNode l1Next = null;
        ListNode l2Next = null;
        int addNext = 0;
        int val = add;

        if (l1 != null) {
            val += l1.val;
            l1Next = l1.next;
        }
        if (l2 != null) {
            val += l2.val;
            l2Next = l2.next;
        }
        if (val == 0 && l1 == null && l2 == null) {
            return null;
        }
        if (val >= 10) {
            addNext = val/10;
            val = val % 10;
        }
        ListNode result = new ListNode(val);
        result.next = addTwoNumbers(l1Next, l2Next, addNext);
        return result;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
