public class rotateALL {


    
    // T=O(2N)  , S=O(1)
    public Node rotateRight(Node head, int k) {

        if (head==null) {
            return null;
        }

        int len = 1;
        Node temp= head;
        while (temp.next!=null) {
            len++;
            temp= temp.next;
        }

        if (k%len==0) {
            return head;
        }

        int cnt = len-(k%len);
        cnt-=1;

        Node temp1 = head;

        while (temp1!=null && cnt >0) {
            cnt--;
            temp1 = temp1.next;
        }
        temp.next = head;
        head = temp1.next;
        temp1.next = null;

        return head;

    }





}
