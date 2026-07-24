public class sortLLOfZeroOneAndTwos {

    // T=O(2N) , S=O(1)
    // public static Node sort(Node head) {
    // int cnt0 = 0;
    // int cnt1 = 0;
    // int cnt2 = 0;

    // Node temp = head;
    // while (temp != null) {
    // if (temp.data == 0) {
    // cnt0++;
    // } else if (temp.data == 1) {
    // cnt1++;
    // } else {
    // cnt2++;
    // }
    // temp = temp.next;
    // }
    // temp = head;

    // for (int i = 0; i < cnt0; i++) {
    // temp.data = 0;
    // temp = temp.next;
    // }

    // for (int i = 0; i < cnt1; i++) {
    // temp.data = 1;
    // temp = temp.next;
    // }

    // for (int i = 0; i < cnt2; i++) {
    // temp.data = 2;
    // temp = temp.next;
    // }
    // return head;
    // }


    // Optiaml T=O(N) , S=O(1)
    public static Node sort(Node head) {
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;

        while (temp != null) {

            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            } else {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;

        }

        if (oneHead.next != null) {
            zero.next = oneHead.next;
        }else{
            zero.next = twoHead.next;
        }

        one.next = twoHead.next;
        two.next=null;

        return zeroHead.next;

    }

}
