public class oddEvenLL {

    // Brute
    // public Node oddEvenList(Node head){
    // Node temp = head;
    // int k = 0;
    // Node dummyNode = new Node(-1);
    // Node curr = dummyNode;
    // while (temp!=null) {
    // k++;
    // if (k%2!=0) {
    // curr.next = new Node(temp.data);
    // curr = curr.next;
    // }
    // temp=temp.next;
    // }
    // temp =head;
    // k=0;
    // while (temp != null) {
    // k++;
    // if (k % 2 == 0) {
    // curr.next = new Node(temp.data);
    // curr = curr.next;
    // }
    // temp = temp.next;

    // }

    // return dummyNode.next;

    // }

    // Optimal T=O(N) , S=O(1)

    public Node oddEvenList(Node head) {
        if (head == null) {
            return null;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;

    }

}
