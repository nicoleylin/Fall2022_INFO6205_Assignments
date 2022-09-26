public class RotateList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        //consider the edge case
        if (head == null) {
            return null;
        }
        int length = 1;
        ListNode tail = head;
        //compute the length of linked list
        while (tail.next != null) {
            tail = tail.next;
            ++length;
        }
        //recompute the number of times needed to rotate
        k = k % length;
        if (k == 0) {
            return head;
        }
        //use cur pointer to find the pivot and rotate it
        ListNode cur = head;
        for (int i = 0; i < k - length - 1; ++i) {
            cur = cur.next;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        tail.next = head;
        return newHead;

    }
}