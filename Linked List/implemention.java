import easy.numberAppearsOneTImeInArray;

class Node {
    int data;
    Node next;

    Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class implemention {

    // T=O(1)
    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;

    }

    // T=O(1)
    private static int lengthOfLL(Node head) {
        int L = 0;
        Node temp = head;
        while (temp != null) {

            L++;
            temp = temp.next;

        }
        return L;
    }

    // T=O(1)
    private static int checkIfPresent(Node head, int val) {
        int ans = 0;
        Node temp = head;
        while (temp != null) {

            if (temp.data == val) {
                ans = 1;
                break;
            }
            temp = temp.next;

        }
        return ans;
    }

    private static Node deleteHead(Node head) {
        if (head == null) {
            return head;
        }

        head = head.next;
        return head;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }

    // T=O(N)
    private static Node deleteKthElement(Node head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            return deleteHead(head);
        }

        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;

            }
            prev = temp;
            temp = temp.next;

        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        Node head = convertArr2LL(arr);
        Node temp = head;
        // while (temp!=null) {

        // System.out.println(temp.data);
        // temp=temp.next;

        // }
        // System.out.println(lengthOfLL(head));
        // System.out.println(checkIfPresent(head, 2));

        head = deleteKthElement(head, 7);
        temp = head;
        while (temp != null) {

            System.out.println(temp.data);
            temp = temp.next;

        }

    }

}
