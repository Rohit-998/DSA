import java.util.Stack;

public class reverseLL {
 
    // Brute T=(2N) , O(N)
    // public static Node reverse(Node head) {
    //     Stack<Integer> st = new Stack<>();
    //     Node temp = head;

    //     while (temp != null) {
    //         st.add(temp.data);
    //          temp=temp.next;
    //     }
    //     temp = head;

    //     while (temp != null) {
    //         temp.data = st.pop();
    //        temp=temp.next;
    //     }

    //     return head;

    // }

    // Optimal T=O(N) , S=O(1)
    public static Node reverse(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Node ahead = head.next;

        while (ahead !=null) {
            Node temp2 = ahead.next;
            ahead.next = temp;
            temp = ahead;
            ahead = temp2;
        }
        head.next = null;
        head = temp;


        return head;


    }


}
