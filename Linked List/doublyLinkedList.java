class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    DNode(int data, DNode next, DNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class doublyLinkedList {

    // T=O(N)
    private static DNode convertArr2LL(int[] arr) {
        DNode head = new DNode(arr[0]);
        DNode prev = head;

        for (int i = 1; i < arr.length; i++) {
            DNode temp = new DNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;

        }

        return head;

    }

    // T=O(N)
    private static void print(DNode head) {
        if (head == null) {
            System.out.println("LL Is Empty");
            return;
        }
        DNode temp = head;
        while (temp != null) {

            System.out.println(temp.data);
            temp = temp.next;

        }

    }
    
    // T=O(1)
    private static DNode deleteHead(DNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        DNode temp = head;
        head = head.next;
        head.prev = null;
        temp.next=null;
        return head;
        

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 8 };
        DNode head = convertArr2LL(arr);
        // print(head);

        head = deleteHead(head);
        print(head);
    }

}
