import java.util.HashMap;
import java.util.Map;

public class detectAloopInLL {

    // Brute T=O(N) , S=O(N)
    // public boolean hasCycle(Node head) {
    //     Map<Node, Integer> map = new HashMap<>();
    //     Node temp = head;

    //     boolean flag = false;
    //     while (temp != null) {
    //         if (map.containsKey(temp)) {
    //             flag = true;
    //             break;
    //         }
    //         map.put(temp, 1);
    //         temp = temp.next;
    //     }
    //     return flag;

    // }

    // Optimal T=O(N) , S=O(1)
    public boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

}
