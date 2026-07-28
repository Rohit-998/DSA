import java.util.HashMap;
import java.util.Map;

public class startingPointOfLL {

   // Brute T=O(N) , S=O(N)
//    public static Node detectCycle(Node head){
//     Map<Node,Integer> map = new HashMap<>();
            
//     Node temp = head;
//     while (temp!=null) {

//         if (map.containsKey(temp)) {
//             return temp;
//         }
//         map.put(temp, 1);
//         temp=temp.next;
        
//     }
//     return null;

//    }


// Optimal T=O(N) , S=O(1)
public static Node detectCycle(Node head){

    Node slow = head;
    Node fast= head;
    while (fast!=null && fast.next!=null) {
         slow = slow.next;
         fast = fast.next.next;
         if (slow==fast) {
           slow = head;
           while (slow!=fast) {
            slow=slow.next;
            fast=fast.next;
           } 
           return slow;
         }
    }
    return null;
}



 

    
}
