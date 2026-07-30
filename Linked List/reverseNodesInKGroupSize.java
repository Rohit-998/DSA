public class reverseNodesInKGroupSize {

    Node getKtNode(Node temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;

        }
        return temp;
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Node ahead = head.next;

        while (ahead != null) {
            Node temp2 = ahead.next;
            ahead.next = temp;
            temp = ahead;
            ahead = temp2;
        }
        head.next = null;
        head = temp;

        return head;

    }
    
    // T = O(2N) ,  S=O(1)
    public Node reverseKGroup(Node head, int k) {

        Node temp = head;
        Node prevGroupTail = null;

        while (temp != null) {

            Node kthNode = getKtNode(temp, k);

            if (kthNode == null) {
                if (prevGroupTail != null) {
                    prevGroupTail.next = temp;
                }
                break;
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if (temp == head) {
                head = kthNode;
            } else {
                prevGroupTail.next = kthNode;
            }

            prevGroupTail = temp;
            temp = nextNode;

        }

        return head;
    }

}
