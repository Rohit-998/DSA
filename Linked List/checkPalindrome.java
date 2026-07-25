import java.util.Stack;

public class checkPalindrome {

    // public static boolean isPalindrome(Node head){
    //     Stack<Integer> st = new Stack<>();
    //     Node temp = head;
    //     while (temp!=null) {
    //         st.push(temp.data);
    //         temp = temp.next;

    //     }
    //     temp = head;
    //     while (temp!=null) {
    //         if (temp.data!=st.pop()) {
    //             return false;

    //         }
    //         temp = temp.next;
    //     }
    //     return true;
    // }
    
 public static boolean isPalindrome(Node head){
    if (head == null || head.next == null) {
        return true;
    }
    Node slow = head;
    Node fast = head;

    while (fast.next!=null && fast.next.next!=null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node newHead = reverseLL.reverse(slow.next);
    Node temp1 = head;
    Node temp2= newHead;
    while (temp2 != null ) {
        if (temp1.data!=temp2.data) {
            return false;
        }
        temp1= temp1.next;
        temp2 = temp2.next;
    }

    reverseLL.reverse(newHead);
    return true;




 }

}
