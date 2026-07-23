public class addTwoNumbers {



    // T = O(max(N1,N2)) , S=O(max(N1,N2)) 
    public static Node solu(Node l1, Node l2){


        Node dummyNode = new Node(-1);
        Node curr=dummyNode;
        int carry = 0;
        Node t1 = l1;
        Node t2 = l2;

        while (t1!=null || t2!=null) {

            int sum = carry;
            if (t1!=null) {
                sum+=t1.data;
            }
            if (t2!=null) {
                sum+=t2.data;
            }
            Node newNode = new Node(sum%10);
            carry = sum/10;

            curr.next = newNode;
            curr = curr.next;
            if (t1 != null) {
                t1 = t1.next;
            }
            if (t2 != null) {
                t2 = t2.next;
            }
         
        }

        if (carry!=0) {
            Node newNode = new Node(carry);
            curr.next = newNode;
        }

        return dummyNode.next;
    }

}
