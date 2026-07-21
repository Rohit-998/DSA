package Trees;

public class inOrderTraversal {
    public class Node {

        int data;
        Node Left;
        Node Right;

        public Node(int data) {
            this.data = data;
        }
    }
   
    // T=O(N) ,S=O(N)
    public void InOrder(Node node) {
        if (node == null) {
            return;
        }
        InOrder(node.Left);
        System.out.println(node.data);
        InOrder(node.Right);
    }
}
