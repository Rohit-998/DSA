public class mergeTwoSortedLL {


    // T = O(N1 + N2) , S=O(1)
    public Node mergeTwoLists(Node list1, Node list2) {

        Node dummyNode = new Node(-1);

        Node temp1 = list1;
        Node temp2 = list2;
        Node curr = dummyNode;
        while (temp1 != null && temp2 != null) {
            if (temp1.data >= temp2.data) {
                curr.next = temp2;
                temp2 = temp2.next;
            } else {
                curr.next = temp1;
                temp1 = temp1.next;
            }
            curr = curr.next;
        }

        if (temp1 != null)
            curr.next = temp1;
        if (temp2 != null)
            curr.next = temp2;

      
        return dummyNode.next;

    }

}
