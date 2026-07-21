package Trees;

public class preOrderTraversal {

    public class Node {

        int data;
        Node Left;
        Node Right;

        public Node(int data) {
            this.data = data;
        }
    }
    
    // T=O(N) ,S=O(N)
    public void preOrder(Node node){
        if (node==null) {
            return;
        }
        System.out.println(node.data);
        preOrder(node.Left);
        preOrder(node.Right);
    }
}
