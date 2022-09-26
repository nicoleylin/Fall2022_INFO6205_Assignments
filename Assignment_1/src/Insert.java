public class Insert {
    class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }
    public Node insert(Node head, int insertVal) {
        if(head == null){
            Node cur = new Node(insertVal);
            cur.next = cur;
            return cur;
        }
        Node pre = head;
        Node successor = head.next;
        while(true) {
            if (pre.val <= insertVal && successor.val >= insertVal) {
                break;
            }
            if (pre.val > successor.val && (insertVal > pre.val || insertVal < successor.val)) {
                break;
            }
            pre = successor;
            successor = successor.next;
            if (pre == head) {
                break;
            }
        }
        Node new_node = new Node(insertVal);
        new_node = successor;
        pre.next = new_node;
        return head;
    }
}
