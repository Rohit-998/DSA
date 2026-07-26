public class middleOfLL {


    // Brute T=(N+(N/2)) , S=O(1)

    // public static Node middleNode(Node head){
    //     int len = 0;
    //     Node temp = head;
    //     while (temp!=null) {
    //         len++;
    //         temp = temp.next;
    //     }
       
    //      temp = head;
    //      for (int i = 1; i < ((len/2)+1); i++) {
    //         temp=temp.next;
    //      }

    //      return temp;

    // }

    // Optimal T=(N) , S=O(1)

    public static Node middleNode(Node head){
        Node slow= head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {

            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }







    
}
