import java.util.HashMap;
import java.util.Map;

public class intersectionPointOfTwoLL {

    // Brute T=O(M+N) , S=O(N)
    // public static Node getIntersectionNode(Node headA, Node headB) {

    // Map<Node, Integer> map = new HashMap<>();

    // Node temp = headA;
    // while (temp != null) {
    // map.put(temp, 1);
    // temp = temp.next;
    // }
    // temp = headB;
    // while (temp != null) {

    // if (map.containsKey(temp)) {
    // return temp;
    // }
    // temp = temp.next;

    // }

    // return null;

    // }

    // Optimal T=O(M+N) , S=O(1)
    public static Node getIntersectionNode(Node headA, Node headB) {
        int lenA = 0;
        int lenB = 0;

        Node tempA = headA;
        Node tempB = headB;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        int d = Math.abs(lenA - lenB);

        if (lenA > lenB) {

            for (int i = 0; i < d; i++) {
                tempA = tempA.next;
            }
        } else {

            for (int i = 0; i < d; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;

    }

}
