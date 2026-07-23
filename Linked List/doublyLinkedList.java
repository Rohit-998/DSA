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
     
    // T=O(N)
    private static DNode deleteTail(DNode head){
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        DNode temp = head;
        while (temp.next!=null) {
            temp = temp.next;

        }
        temp.prev.next = null;
        temp.prev = null;
        return head;

    }

    // T=O(N)
    private static DNode deleteKthElement(DNode head ,int k){

        if (head==null) {
         return null;
        }
        if (k==1) {
            return deleteHead(head);
        }
        int cnt = 0;
        DNode temp = head;

        while (temp!=null) {
            cnt++;
            if (cnt==k-1) {
                DNode ahead = temp.next.next;
                temp.next = ahead;
                if(ahead !=null){
                ahead.prev = temp;
                }
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // T=O(N)
    private static DNode deleteBeforeEle(DNode head , int el){
        if (head==null) {
            return null;
        }
        if (head.next==null) {
            return head;
        }
        if (head.next.data == el) {
            return deleteHead(head);
        }

        DNode temp = head;
        while (temp!=null) {
           if (temp.data == el) {
              DNode prev = temp.prev.prev;
              temp.prev = prev;
              prev.next = temp;
              break;
           } 
           temp= temp.next;
        }
        return head;
    }

    

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 8 };
        DNode head = convertArr2LL(arr);
        // print(head);

        // head = deleteHead(head);
        // print(head);

        // head = deleteTail(head);
        // print(head);

        head = deleteKthElement(head, 3);
        print(head);

    }

}
