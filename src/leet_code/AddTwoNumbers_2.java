package leet_code;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class AddTwoNumbers_2 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;

        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        node.next = new ListNode(4);
        node.next.next = new ListNode(4);

        ListNode node1 = new ListNode(5);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(6);

        ListNode result = new Solution().addTwoNumbers(node, node1);
        System.out.println(result);
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode pointer1 = l1, pointer2 = l2, currentNode = result;
            int dozenCarrier = 0;

            while (pointer1 != null || pointer2 != null) {
                int pointer1Value = (pointer1 == null) ? 0 : pointer1.val;
                int pointer2Value = (pointer2 == null) ? 0 : pointer2.val;

                int sum = pointer1Value + pointer2Value + dozenCarrier;
                dozenCarrier = sum / 10;
                currentNode.next = new ListNode(sum % 10);
                currentNode = currentNode.next;

                if (pointer1 != null) {
                    pointer1 = pointer1.next;
                }

                if (pointer2 != null) {
                    pointer2 = pointer2.next;

                }
            }
            if (dozenCarrier > 0) {
                currentNode.next = new ListNode(dozenCarrier);
            }
            return result.next;
        }

    }
}
