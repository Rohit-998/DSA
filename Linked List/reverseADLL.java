import java.util.Stack;

public class reverseADLL {

    // Brute T = O(2N) , S=O(N)

    // public static DNode reverse(DNode head){
    // DNode temp = head;
    // Stack<Integer> st = new Stack<>();

    // while (temp!=null) {

    // st.push(temp.data);
    // temp = temp.next;

    // }

    // temp =head;
    // while (temp!=null) {
    // temp.data = st.pop();
    // temp = temp.next;
    // }
    // return head;
    // }


   // T = O(N) , S=O(1)
    public static DNode reverse(DNode head) {
        if (head==null || head.next==null) {
           return head; 
        }


        DNode temp = head;
        DNode prev = null;

        while (temp != null) {
            prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            temp = temp.prev;
        }

        return prev.prev;

    }

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

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 8 };
        DNode head = convertArr2LL(arr);

        // print(head);
        head = reverse(head);
        print(head);
    }

}
