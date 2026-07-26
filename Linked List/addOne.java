public class addOne {

    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Node ahead = head.next;

        while (ahead != null) {
            Node temp2 = ahead.next;
            ahead.next = temp;
            temp = ahead;
            ahead = temp2;
        }
        head.next = null;
        head = temp;

        return head;

    }
     // Brute T= O(3N) , S=O(1)
    // public static Node solve(Node head) {

    //     head = reverse(head);
    //     Node temp = head;
    //     int carry = 1;
   
    //     while (temp != null) {
            
    //         temp.data = temp.data + carry;
    //         if (temp.data < 10) {
    //             carry=0;
    //             break;
    //         }else{
    //             temp.data=0;
    //             carry=1;
    //         }
           
    //         temp = temp.next;

    //     }

    //     head =reverse(head);


    //     if (carry != 0) {
    //      Node newNode = new Node(carry);
    //      newNode.next = head;
    //      return newNode;
          
    //     }

    //     return head;
    // }

    
    public static int helper(Node head){
        if (head==null) return 1;

        int carry = helper(head.next);

        head.data += carry;
        if (head.data<10) {
            return 0;
        }
        head.data=0;
        return 1;
    }



    // Brute T= O(N) , S=O(N)

    public static Node solve(Node head){
     
       int carry = helper(head);
   
       if (carry==1) {
        Node newNode = new Node(carry);
        newNode.next = head;
        return newNode;
       }



       return head;
    }

}
