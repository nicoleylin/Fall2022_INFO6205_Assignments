public class SplitListToParts {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] parts = new ListNode[k];
        int length = 0;
        for(ListNode node = head; node != null; node=node.next){
            length++;
        }
        int part_len = length / k;
        int remain = length % k;
        ListNode pre = null;
        ListNode cur = head;
        for(int i =0; cur != null && i<k; i++, remain--){
            parts[i] = cur;
            for(int j=0; j < part_len+(remain>0?1:0);j++){
                pre = cur;
                cur = cur.next;
            }
            pre.next = null;
        }
        return parts;
    }

}
