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

    // T=O(N)
    private static void print(Node head) {
        if (head == null) {
            System.out.println("LL Is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {

            System.out.println(temp.data);
            temp = temp.next;

        }

    }
    
    // T=O(1)
    private static Node deleteHead(Node head) {
        if (head == null) {
            return head;
        }

        head = head.next;
        return head;
    }
     
    // T=O(N)
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

    // T=O(N)
    private static Node deleteEle(Node head, int el) {
        if (head == null) {
            return null;
        }
        if (head.data == el) {
            return deleteHead(head);
        }

        Node temp = head;
        Node prev = null;
        while (temp != null) {

            if (temp.data == el) {
                prev.next = prev.next.next;
                break;

            }
            prev = temp;
            temp = temp.next;

        }

        return head;
    }

    // T=O(N)
    private static Node insertAtStart(Node head, int data) {
        if (head == null) {
            return convertArr2LL(new int[] { data });
        }
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        Node head = convertArr2LL(arr);
        // print(head);
        // System.out.println(lengthOfLL(head));
        // System.out.println(checkIfPresent(head, 2));

        // head = deleteKthElement(head, 4);
        // print(head);
        // head = deleteEle(head, 3);
        // print(head);
        head = insertAtStart(head, 1);
        print(head);

    }

}
