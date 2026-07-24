public class removeNthNodeFromTheEnd {

    // Brute T=O(2 * Len) , S=O(1)
    // public static Node remove(Node head,int n){

    // Node temp = head;
    // int cnt = 0;
    // while (temp!=null) {
    // cnt++;
    // temp = temp.next;
    // }
    // if (cnt==n) {
    // return head.next;
    // }
    // temp = head;
    // cnt = cnt-n-1;
    // while (cnt!=0) {
    // temp = temp.next;
    // cnt--;
    // }

    // if (temp.next!=null) {
    // temp.next = temp.next.next;
    // }

    // return head;
    // }


    // Optimal T=O(Len) , S=(1)
    public static Node remove(Node head, int n) {
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next; 
        }

        Node slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }

}
