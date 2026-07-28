public class removeDuplicatesFromSortedDLL {


    // Optimal T=O(N) , S=O(1)
    public static DNode removeDuplicates(DNode head) {

        if (head == null || head.next == null) {

            return head;

        }
        DNode temp = head;
        while (temp != null && temp.next != null) {
            DNode nextNode = temp.next;
            while (nextNode != null && nextNode.data == temp.data) {
                nextNode=nextNode.next;
            }
            temp.next = nextNode;
            if (nextNode!=null) {
                nextNode.prev = temp;
            }
            temp =temp.next;

        }
       return head;
    }

}
