public class deleteAllOccOfAKeyInDll {


    // T=O(N) , S=O(1)
    public static DNode deleteAllOcc(DNode head, int key) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            if (key == head.data) {
                return null;
            }
        }

        DNode temp = head;
        while (temp != null) {
            if (temp.data == key) {
                if (temp == head) {
                    head = head.next;
                    
                }
                DNode back = temp.prev;
                DNode front = temp.next;
                if (back != null) {

                    back.next = front;

                } if (front!=null) {
                    front.prev=back;
                }

            }
            temp = temp.next;

        }
        return head;

    }

}
