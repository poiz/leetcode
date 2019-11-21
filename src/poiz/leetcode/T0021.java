package poiz.leetcode;

public class T0021 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        print(new Solution().mergeTwoLists(l1, l2));
        print(new Solution().mergeTwoLists(new ListNode(1), null));

    }

    static void print(ListNode l) {
        if (l == null) return;
        StringBuilder s = new StringBuilder(String.valueOf(l.val));
        while (l.next != null) {
            s.append("->").append(l.next.val);
            l = l.next;
        }
        System.out.println(s.toString());
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            ListNode head = new ListNode(0);
            ListNode l = head;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    l.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    l.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
                l = l.next;
            }
            if (l1 != null) l.next = l1;
            if (l2 != null) l.next = l2;
            return head.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

}
