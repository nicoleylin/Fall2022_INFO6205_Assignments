public class RemoveElements {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode dummy_head = new ListNode();
        dummy_head.next = head;
        ListNode cur = dummy_head;
        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return dummy_head.next;
    }
}
