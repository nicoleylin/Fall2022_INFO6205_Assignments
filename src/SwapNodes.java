public class SwapNodes {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
    public ListNode swapNodes(ListNode head, int k){
        int arr[] = new int[10^5];
        ListNode cur = head;
        int i=0;
        while(cur != null){
            arr[i] = cur.val;
            cur = cur.next;
            ++i;
        }
        int temp;
        temp = arr[k-1];
        arr[k-1] = arr[-k];
        arr[-k] = temp;

        ListNode dummy_head = new ListNode(0);
        ListNode pre = dummy_head;
        for(int j=0; j< arr.length; ++j){
            pre.next = new ListNode(arr[j]);
            pre = pre.next;
        }
        return dummy_head.next;
    }
}
